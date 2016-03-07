/**
 * @author Teo Matase
 * @author Royce Li
 * Exception for invalid inputs
 */
package assignment4;

public class InputIsNotValidException extends Exception{
	private static final long serialVersionUID = 1L;
	public InputIsNotValidException(String exception){
		super(exception);
	}

}
