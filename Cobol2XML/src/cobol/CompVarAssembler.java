package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class CompVarAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		// TODO Auto-generated method stub
		Cobol c = new Cobol();
		Token t = (Token) a.pop();

		c.setVariableType(t.sval());
//		System.out.println(c.getVariableType());
		
		t = (Token) a.pop();
		c.setNumVar((int) Math.round(t.nval()));
		c.getNumVar();
//		System.out.println(c.getNumVar());
		
		t = (Token) a.pop();
		
		t = (Token) a.pop();
		c.setVariableName(t.sval());
//		System.out.println(c.getVariableName());
		
		t = (Token) a.pop();
		c.setLineNumber((int) Math.round(t.nval()));
//		System.out.println(c.getLineNumber());
		
		a.setTarget(c);
	}

}
