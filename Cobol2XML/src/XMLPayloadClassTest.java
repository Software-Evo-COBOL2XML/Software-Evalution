import static org.junit.Assert.*;

import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import XMLWriter.XMLPayload;
import cobol.Cobol;

public class XMLPayloadClassTest {

	@Test
	public void test() {
		XMLPayload m = new XMLPayload();
		Cobol c = new Cobol();
		
		c.setCommentLine("This is a comment");
		m.addElements(c);
		m.writeFile("XMLTest");
		
		assertEquals(c.getCommentLine(), "This is a comment");
//		fail("Not yet implemented");
	}

}
