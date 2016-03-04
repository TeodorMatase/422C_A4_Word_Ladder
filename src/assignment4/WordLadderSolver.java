/**
 * @author Teo Matase
 * @author Royce Li
 * Solves the word Ladder
 */


package assignment4;

import java.util.*;
import java.io.*;

// do not change class name or interface it implements
public class WordLadderSolver
{
	public List<String> Dictionary;
	public List<String> WordLadder;
	
	public WordLadderSolver(String dict){
		String filename = dict.trim();
		if(filename.length() == 0){
			throw Exception("No files were labelled as input");
		}
		try {
			FileInputStream in = new FileInputStream(filename);
			 BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	     
	     
	}
    // declare class members here.

    // add a constructor for this object. HINT: it would be a good idea to set up the dictionary there

    public LinkedList computeLadder(String startWord, String endWord) throws NoSuchLadderException 
    {
        // implement this method
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    public boolean validateResult(String startWord, String endWord, LinkedList wordLadder) 
    {
    	LinkedList a = new LinkedList(startWord,endWord);
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    // add additional methods here
}
