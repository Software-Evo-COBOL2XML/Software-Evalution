import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembler;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

public class AssemblyClassTest {

	@Test
	public void test() {
		Stack<Object> stack = new Stack<Object>();
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		stack.add("Test");
		stack.add("Test1");
		stack.add("Test2");
		
		t.setString("01  entry_char   redefines entry_number pic x(16).");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
	}

}
