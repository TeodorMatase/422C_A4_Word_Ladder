/**
 * @author Teo Matase
 * @author Royce Li
 * Main Driver for Word Ladder
 */


package assignment4;

import java.util.List;

public class A4Driver {
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        // Create a word ladder solver object
    	Dictionary Dictionary = new Dictionary(args[0]);
    	System.out.println(Dictionary.length);
/*       WordLadderSolver wordLadderSolver = new WordLadderSolver(args[0]);

        try 
        {
            LinkedList result = wordLadderSolver.computeLadder("money", "honey");
			boolean correct = wordLadderSolver.validateResult("money", "honey", result);
        } 
        catch (NoSuchLadderException e) 
        {
            e.printStackTrace();
        }
 */   
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
}


