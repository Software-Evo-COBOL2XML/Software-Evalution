package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class RedefineVarAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		// TODO Auto-generated method stub
		Cobol c = new Cobol();
		Token t = (Token) a.pop();
		c.setVariableRange((int) Math.round(t.nval()));
//		System.out.println(c.getVariableRange());

		
		t = (Token) a.pop();
		c.setVariableType(t.sval());
//		System.out.println(c.getVariableType());
		
		t = (Token) a.pop();
//		System.out.println(t);
		
		t = (Token) a.pop();
		c.setRedefinedVariableName(t.sval());
//		System.out.println(c.getRedefinedVariableName());
		
		t = (Token) a.pop();
		if (t.sval().contains("redefines")) {
			c.setRedefine(true);
		}
		
//		System.out.println(c.isRedefine());
		
		t = (Token) a.pop();
		c.setEntry_char( t.sval() );
		c.getEntry_char();
//		System.out.println(t);
		
		t = (Token) a.pop();
		c.setLineNumber( (int) Math.round(t.nval()));
		c.getLineNumber();
//		System.out.println(c.getLineNumber());
		a.setTarget(c);
	}

}
