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
	public Dictionary Dict;
	public List<String> WordLadder;
	
	public WordLadderSolver(String dict){
		this.Dict = new Dictionary(dict);
	   
	     
	     
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
