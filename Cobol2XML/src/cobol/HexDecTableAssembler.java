package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class HexDecTableAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		Token t = (Token) a.pop(); 
		if(t.sval() != null) {
			c.setIfStatement(t.sval().trim()+ defaultDelimiter() + a.remainder(defaultDelimiter()));
//			t = (Token) a.pop();
			a.setTarget(c); 
			}
		}
	
//		System.out.println(t);
//		t = (Token) a.pop();
//		System.out.println(t);
//		t = (Token) a.pop();
//		System.out.println(t);
//		t = (Token) a.pop();
//		System.out.println(t);
//		t = (Token) a.pop();
//		System.out.println(t);
//		t = (Token) a.pop();
//		System.out.println(t);
//		t = (Token) a.pop();
//		System.out.println(t);

	public String defaultDelimiter() {
		String delimiter = " ";
		return delimiter; 
		
	}
}
