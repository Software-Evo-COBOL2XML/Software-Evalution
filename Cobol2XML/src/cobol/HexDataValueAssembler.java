package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class HexDataValueAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		// TODO Auto-generated method stub
		Cobol c = new Cobol();
		Token t = (Token) a.pop(); // hopefully the token following the comment
		
		c.setVariableType( t.sval().trim() + defaultDelimiter() + a.remainder(defaultDelimiter()));
		c.getVariableType();
		System.out.println(c.getVariableType());
		
		t = (Token) a.pop();
		
		t = (Token) a.pop();
		c.setVariableName( t.sval() );
		c.getVariableName();
		System.out.println(c.getVariableName());
		
		t = (Token) a.pop();
		c.setLineNumber( (int) Math.round(t.nval()));
		c.getLineNumber();
		System.out.println(c.getLineNumber());
		a.setTarget(c);
	}
	
	public String defaultDelimiter() {
		String delimiter = " ";
		return delimiter; 
		
	}

}
