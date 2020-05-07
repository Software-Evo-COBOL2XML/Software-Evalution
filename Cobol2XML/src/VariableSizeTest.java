import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

class VariableSizeTest {

	@Test
	void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		
		t.setString("01  w_number                            pic 9(16).");
		
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();

		/*
		 * Bad data to see if test fails
		 */
//		System.out.print(c.getVariableRange());
//		assertEquals(c.getVariableRange(), "What a range!");
//		fail("redefined variable incorrect");

		/*
		 * 	Expected data that should pass the test
		 */
		System.out.print(c.getVariableRange());
		assertEquals(c.getVariableRange(), 16);
	}

}
