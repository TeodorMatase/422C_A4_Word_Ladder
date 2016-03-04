/**
 * @author Teo Matase
 * @author Royce Li
 * Main Driver for Word Ladder
 */


package assignment4;

import java.util.List;

public class A4Driver {
    public static void main(String[] args)
    {
        // Create a word ladder solver object
        Assignment4Interface wordLadderSolver = new WordLadderSolver();

        try 
        {
            List<String> result = wordLadderSolver.computeLadder("money", "honey");
            boolean correct = wordLadderSolver.validateResult("money", "honey", result);
        } 
        catch (NoSuchLadderException e) 
        {
            e.printStackTrace();
        }
    }


public String MakeLadder(String fromWord, String toWord, int position){
	
	return "";
}

}
