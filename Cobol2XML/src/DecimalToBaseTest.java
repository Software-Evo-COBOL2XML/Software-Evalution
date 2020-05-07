import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

class DecimalToBaseTest {

	@Test
	void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		
		t.setString("perform until w_number < current_base");
		Assembly in = new TokenAssembly(t); 
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		
		c = (Cobol) out.getTarget();
		
//		System.out.println(c.getPerform());


		/*
		 * Bad data to see if test fails
		 */

//		assertEquals(c.getPerform(), "Not Performing");
//		fail("This is not a section within decimal to base");

		/*
		 * 	Expected data that should pass the test
		 */
		assertEquals(c.getPerform(), "until w_number < current_base");
	}

}
