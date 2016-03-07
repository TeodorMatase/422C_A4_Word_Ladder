/**
 * @author Teo Matase
 * @author Royce Li
 * Main Driver for Word Ladder
 */


package assignment4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class A4Driver {
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {   try{
		if (args.length <= 1){
			throw new FileNotFoundException("There is no input file");
		}
    	}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			return;
		}

    	Dictionary Dictionary = new Dictionary(args[0]);
    	WordLadderSolver WLS = new WordLadderSolver(Dictionary);
    	String line = null;
    	try {
			FileReader in = new FileReader(args[1]);
			BufferedReader reader = new BufferedReader(in);
			while((line = reader.readLine()) != null){
				String temp = line;
				line = line.replaceAll("\\s+", "");
				try{
					if(line.length() > 11 || line.length() < 10){
						throw new InputIsNotValidException(temp + " Is not a valid input\n");
					
					}
				}
				catch(InputIsNotValidException e){
					System.out.print(e.getMessage());
					continue;
				}
				try{
					for(int i = 0; i < line.length(); i ++){
						if(!(((int)line.charAt(i) >= 'A' && (int)line.charAt(i) <= 'Z') || ((int)line.charAt(i) >= 'a' && (int)line.charAt(i) <= 'z'))){
							throw new InputIsNotValidException(temp + " Is not a valid input\n");
						}
					}
				}
				catch(InputIsNotValidException e){
					System.out.print(e.getMessage());
					continue;
				}
				String startWord = line.substring(0, 5);
				String endWord = line.substring(5);
				WLS.MakeLadder(startWord, endWord, 0);
				try {
					WLS.Check(startWord,endWord);
				} catch (NoSuchLadderException e) {
					System.out.println("There exists no valid WordLadder between "+startWord+" and "+endWord);
					WLS.Clear();
					continue;
				}
				WLS.print(startWord,endWord);
				WLS.Clear();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
