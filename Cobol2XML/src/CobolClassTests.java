import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;

public class CobolClassTests {

	@Test
	public void test() {
		Cobol c = new Cobol();
		
		/*
		 * Bad data to see if test fails
		 */

//		Object s1 = "Cobol Object";
//		Object s2 = "Not a cobol object";
//		fail("The cobol objects do not match");
		
		/*
		 * 	Expected data that should pass the test
		 */
		Object s1 = "Cobol Object";
		Object s2 = "Cobol Object";
		
		boolean cobol = c.equal(s1, s2);
		assertEquals(cobol, true);

	}

}
