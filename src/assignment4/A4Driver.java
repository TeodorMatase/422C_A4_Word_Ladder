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
    public static void main(String[] args)
    {
        // Create a word ladder solver object
    	Dictionary Dictionary = new Dictionary(args[0]);
    	WordLadderSolver WLS = new WordLadderSolver(Dictionary);
    	String line = null;
    	try {
			FileReader in = new FileReader(args[1]);
			BufferedReader reader = new BufferedReader(in);
			while((line = reader.readLine()) != null){
				line.replaceAll("\\s+", "");
				if(line.length() > 11){
					System.out.println(line + " Is not a valid input\n");
					continue;
				}
				String startWord = line.substring(0, 5);
				String endWord = line.substring(6);
				WLS.MakeLadder(startWord, endWord, 0);
				WLS.print();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}


    /* @param startWord The starting word in the word ladder.
    * @param endWord The ending word in the word ladder.
    * @return A list of strings that represents the word ladder. The 0th index should contain
    * the startWord and the last position should contain endWord. All intermediate words should
    * be different by exactly one letter.
    * @throws NoSuchLadderException is thrown if no word ladder can be generated from startWord and endWord.
    */
    
    
/*    
public String MakeLadder(String fromWord, String toWord, int position){
	if(charDifference(fromWord,toWord) == 1){
		return fromWord;
	}
	return "";
}


public int charDifference(String fromWord, String toWord){
	int count = 0;
	for(int i = 0; i < 5; i++){
		char a = fromWord.charAt(i);
		char b = fromWord.charAt(i);
		if(b != a){
			count++;
		}
	}
	return count;
}
*/



