import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

class MainLogicTest {

	@Test
	void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		
		t.setString("display window erase");
		Assembly in = new TokenAssembly(t); 
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		
		c = (Cobol) out.getTarget();


		/*
		 * Bad data to see if test fails
		 */

		assertEquals(c.getStatement(), "This is not a statement");
		fail("redefined variable incorrect");

		/*
		 * 	Expected data that should pass the test
		 */
		assertEquals(c.getStatement(), "display window erase");

		}

}
