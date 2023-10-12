package chap09.ex03;

public class SerializedPageResponderTest {
	public void testGetPageHierachyAsXml() throws Exception {
		givenPages("PageOne", "PageOne.ChildOne", "PageTwo");
		
		whenRequestIsIssured("root", "type:pages");
		
		thenResponseShouldBeXML();
	}
	
	public void testGetPageHierarchyHasRightTags() throws Exception {
		givenPages("PageOne", "PageOne.ChildOne", "PageTwo");
		
		whenRequestIsIssured("root", "type:pages");
		
		thenResponseShouldContain(
				"<name>PageOne</name>", 
				"<name>PageTwo</name>", 
				"<name>ChildOne</name>"
				);
	}
	

	private void thenResponseShouldContain(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}

	private void thenResponseShouldBeXML() {
		// TODO Auto-generated method stub
		
	}

	private void whenRequestIsIssured(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	private void givenPages(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
}
