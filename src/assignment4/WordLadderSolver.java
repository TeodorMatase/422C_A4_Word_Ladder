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
	
    /*MakeLadder:
     * Creates the wordLadder between startWord and endWord
     */
    public boolean MakeLadder(String startWord, String endWord, int position){
    	WordLadder.add(startWord);
    	int dif = charCheck(startWord,endWord);
    	if(dif == 1){ //end condition, only one letter difference
    		WordLadder.add(endWord);
    		return true;
    	}
    	ArrayList<String> temp = new ArrayList<String>();
    	String newWord = null;
    	for(int i = 0; i < Dict.TrueDictionary.size(); i++){
    		newWord = Dict.TrueDictionary.get(i);
    		if(newWord.charAt(position) != startWord.charAt(position)){
    			continue;
    		}//characters at position need to be the same because that position cannot be changed
    		else{
    			if(temp.contains(newWord) == true || WordLadder.contains(newWord) == true || newWord.equals(startWord)){
    				continue;
    			}
    			else{
    				if(charCheck(newWord, startWord) == 1){
    					temp.add(newWord);
    				}//add to the temporary solution list
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
    		}
    	WordLadder.remove(startWord);
    	return false;
   }

    
    /*charcheck:
     * checks how many characters are different between two words
     */
    private int charCheck(String startWord, String endWord){
    	int count = 0;
    	for(int i = 0; i < 5; i++){
    		if(startWord.charAt(i) != endWord.charAt(i)){
    			count++;
    		}
    	}
    	return count;
    }
    
    /*Poscheck:
     * Checks which position is different between a word in the temp list
     * and the current word. All words in the temp list are one letter away
     * from the current word
     */
    private int poscheck(String startWord, String endWord){
    	for(int i = 0; i < 5; i++){
    		if(startWord.charAt(i) != endWord.charAt(i)){
    			return i;
    		}
    	}
    	return (Integer) null;
    }
    
    /*print:
     * prints out every word in the WordLadder
     */
    public void print(String startWord, String endWord){
    	System.out.println("**********");
    	if(startWord.equals(endWord)){
    		System.out.println(startWord+"\n"+endWord);
    		System.out.println("**********");
    		return;
    	}
    	for(int i = 0; i < this.WordLadder.size(); i++){
    		System.out.println(this.WordLadder.get(i) + " ");
    	}
    	System.out.println("**********");
    }
    
    /*Clear:
     * Clears every word from the WordLadder
     */
    public void Clear(){
    	while(WordLadder.size() > 0){
    		WordLadder.remove(0);
    	}
    }

    /*Check:
     * Checks to see if the WordLadder is valid, i.e. every step only changes 1 letter
     */
    public void Check(String startWord, String endWord) throws NoSuchLadderException{
    	if(WordLadder.size() == 0){
    		throw new NoSuchLadderException("There exists no valid WordLadder between "+startWord+" and "+endWord);
    	}
    	String temp1 = null;
    	String temp2 = null;
    	for(int i = 0; i < WordLadder.size() - 1; i++){
    		temp1 = WordLadder.get(i);
    		temp2 = WordLadder.get(i+1);
    		if(charCheck(temp1,temp2)!= 1){
    			throw new NoSuchLadderException("There exists no valid WordLadder between "+startWord+" and "+endWord);
    		}
    	}
    }
}
