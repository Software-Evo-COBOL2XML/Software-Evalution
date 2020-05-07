import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.Test;

import XMLWriter.XMLPayload;
import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.Token;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;
class RedefinedVarTest {

	@Test
	void redefinedVarTest() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		
		t.setString("01  entry_char   redefines entry_number pic x(16).");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();

		/*
		 * Bad data to see if test fails
		 */

//		assertEquals(c.getRedefinedVariableName(), "entry_char");
//		fail("redefined variable incorrect");

		/*
		 * 	Expected data that should pass the test
		 */
		assertEquals(c.getRedefinedVariableName(), "entry_number");
	}

}
