import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import XMLWriter.XMLPayload;
import cobol.Cobol;

class XMPayload {

	@Test
	public void testXMLPayload() {
		XMLPayload m = new XMLPayload();
		Cobol c = new Cobol();
		c.setCommentLine("This is a comment line");
		m.addElements(c);
		System.out.print(m);
		assertEquals(m, "bbbb");
	}

}
