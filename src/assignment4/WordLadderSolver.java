/**
 * @author Teo Matase
 * @author Royce Li
 * Solves the word Ladder
 */


package assignment4;

import java.util.*;
import java.io.*;

public class WordLadderSolver
{
	public static Dictionary Dict;
	public ArrayList<String> WordLadder; //SolutionList
	
	public WordLadderSolver(Dictionary dict1){
		WordLadder = new ArrayList<String>();
		WordLadderSolver.Dict = dict1;
	}
	

    public ArrayList<String> computeLadder(String startWord, String endWord) //throws NoSuchLadderException
    {
    	WordLadder.add(startWord);
    	WordLadder.add(endWord);
    	if(startWord.equals(endWord)){
    		return WordLadder;
    	}
        // implement this method
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    
    public boolean MakeLadder(String startWord, String endWord, int position){
    	WordLadder.add(startWord);
    	int dif = charCheck(startWord,endWord);
    	if(dif == 1){ //end condition, only one letter difference
    		return true;
    	}
    	ArrayList<String> temp = new ArrayList<String>();
    	String newWord = null;
    	for(int i = 0; i < Dict.TrueDictionary.size(); i++){
    		newWord = Dict.TrueDictionary.get(i);
    		if(newWord.charAt(position) != startWord.charAt(position)){
    			continue;
    		}
    		else{
    			if(temp.contains(newWord) == true || WordLadder.contains(newWord) == true || newWord.equals(startWord)){
    				continue;
    			}
    			else{
    				if(charCheck(newWord, startWord) == 1){
    					temp.add(newWord);
    				}
    				else{
    					continue;
    				}
    			}
    		}
    	}
    	for(int j = 0; j < temp.size(); j++){
    		int newpos = poscheck(temp.get(j), startWord);
    			if(MakeLadder(temp.get(j),endWord,newpos) == true){
    				if(WordLadder.contains(temp.get(j)) == true){
    					return true;
    				}
    				else{
    					WordLadder.add(temp.get(j));
    					return true;
    				}
    			}
    			else{
    				WordLadder.remove(startWord);
    				for(int k = 0; k < temp.size(); k++){
    					WordLadder.remove(temp.get(k));
    				}
    			}
    		}
    	WordLadder.remove(startWord);
    	return false;
   }

    
    //Prints out the WordLadder
    private int charCheck(String startWord, String endWord){
    	int count = 0;
    	for(int i = 0; i < 5; i++){
    		if(startWord.charAt(i) != endWord.charAt(i)){
    			count++;
    		}
    	}
    	return count;
    }
    //Checks which position is different
    private int poscheck(String startWord, String endWord){
    	for(int i =0; i < 5; i++){
    		if(startWord.charAt(i) != endWord.charAt(i)){
    			return i;
    		}
    	}
    	return 6;
    }
    public void print(){
    	System.out.println("**********\n");
    	for(int i = 0; i < this.WordLadder.size(); i++){
    		System.out.println(this.WordLadder.get(i) + " ");
    	}
    	System.out.println("**********\n");
    }

/*    public boolean validateResult(String startWord, String endWord, ArrayList<String> wordLadder) 
    {
    	LinkedList a = new LinkedList(startWord,endWord);
        throw new UnsupportedOperationException("Not implemented yet!");
    }

*/   // add additional methods here
}
