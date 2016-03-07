package assignment4;

import static org.junit.Assert.*;
import org.junit.*;

public class WordLadderSolverTest {

	@Test
	public void testWordLadderSolver() {
		fail("Not yet implemented");
	}

	@Test
	public void testMakeLadder() {
		fail("Not yet implemented");
	}

	@Test
	public void testCharCheck() {
		Dictionary dictionary = new Dictionary("test"); 
		WordLadderSolver test = new WordLadderSolver(dictionary);
		int test1 = test.charCheck("plane", "place");
		assertEquals("one character different", 1, test1);
		int test2 = test.charCheck("plane", "plane");
		assertEquals("no character different", 0, test2);
	}

	@Test
	public void testPoscheck() {
		Dictionary dictionary = new Dictionary("test"); 
		WordLadderSolver test = new WordLadderSolver(dictionary);
		int test1 = test.poscheck("test", "rest");
		assertEquals("position one different", 0, test1);
		int test2 = test.poscheck("plane", "place");
		assertEquals("position two different", 3, test2);
	}

	@Test
	public void testPrint() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		Dictionary dictionary = new Dictionary("test"); 
		WordLadderSolver test = new WordLadderSolver(dictionary);
		boolean test1 = test.Clear();
		assertEquals(true, test1);
	}

	@Test
	public void testCheck() {
		fail("Not yet implemented");
	}

}
