import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

public class VariableTypeTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		
		t.setString("77  rest_divide                         pic 99.");
		
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();

		/*
		 * Bad data to see if test fails
		 */
		assertEquals(c.getNumVar(), "x");
		fail("This is not a number variable");

		/*
		 * 	Expected data that should pass the test
		 */
		assertEquals(c.getNumVar(), 99);
	}

}
