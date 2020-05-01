package cobol;

import parse.Assembler;
import parse.Assembly;
import parse.tokens.Token;

public class NumVarSizeAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		// TODO Auto-generated method stub
		Cobol c = new Cobol();
		Token t = (Token) a.pop(); // hopefully the token following the comment
		
		c.setVariableRange( (int) Math.round(t.nval()));
		c.getVariableRange();
//		System.out.println(t);
		
		t = (Token) a.pop();
		c.setNumVar( (int) Math.round(t.nval()));
		c.getNumVar();
//		System.out.println(c.getNumVar());
		
		t = (Token) a.pop();
		
		t = (Token) a.pop();
		c.setNumVarName( t.sval() );
		c.getNumVarName();
//		System.out.println(c.getNumVarName());
		
		t = (Token) a.pop();
		c.setLineNumber( (int) Math.round(t.nval()));
		c.getLineNumber();
//		System.out.println(c.getLineNumber());
		a.setTarget(c);
	}

}
