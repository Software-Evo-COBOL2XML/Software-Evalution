import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

class VariableNameTest {

	@Test
	void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		
		t.setString("77  ind                                 pic 99 comp-x.");
		
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();

		/*
		 * Bad data to see if test fails
		 */

//		assertEquals(c.getVariableName(), "ThisIsNotAVariableName");
//		fail("redefined variable incorrect");

		/*
		 * 	Expected data that should pass the test
		 */
		assertEquals(c.getVariableName(), "ind");
	}

}
