package chap09.ex01;

public class SerializedPageResponderTest extends RegexTest {
	private final String RootPath = "TestRooT";
	private PageCrawler crawler;
	private WikiPage root;
	private MockRequest request;
	String xml;
	private PageData data;
	
	public void testGetPageHieratchyAsXml() throws Exception {
		makePages("PageOne", "PageOne.ChildOne", "PageTwo");

		submitRequest("root", "type:pages");
		
		assertResponseIsXML();
		assertResponseContains("<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>");
	}

	public void testGetPageHieratchyAsXmlDoesntContainSymbolicLinks() throws Exception {
		WikiPage pageOne = crawler.addPage(root, PathParser.parse("PageOne"));
		makePages("PageOne.ChildOne", "PageTwo");

		addLinkTo(pageOne, "SymPage", "PageTwo");

		submitRequest("root", "type:pages");
		
		assertResponseIsXML();
		assertResponseContains("<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>");
		assertResponseDoesNotContain("SymPage");
	}



	public void testGetDataAsHtml() throws Exception {
		makePageWithContent("TestPageOne", "test page");

		submitRequest("TestPageOne", "type:pages");
		
		assertResponseIsXML();
		assertResponseContains("test page", "<Test");
	}

	
	private void assertResponseContains(final String string, final String string2) {
		assertSubString(string, xml);
		assertSubString(string2, xml);
	}

	private void makePageWithContent(final String string, final String string2) {
		crawler.addPage(root, PathParser.parse(string), string2);
	}
	
	
	private void assertResponseContains(String string, String string2, String string3) {
		assertResponseContains(string, string2);
		assertSubString(string3, xml);
	}

	private void assertResponseIsXML() {
		Responder responder = new SerializedPageResponder();
		SimpleResponse response = (SimpleResponse) responder.makeResponse(new FitNesseContext(root), request);
		xml = response.getContent();
		assertEquals("text/xml", response.getContentType());
	}

	private void submitRequest(final String string, final String string2) {
		request.setResource(string2);
		String[] split = string2.split(":");
		request.addInput(split[0], split[1]);
	}
	
	private void makePages(final String string, final String string2, final String string3) {
		makePages(string, string2);
		crawler.addPage(root, PathParser.parse(string3));
	}
	
	private void addLinkTo(WikiPage pageOne, final String string, final String string2) {
		data = pageOne.getData();
		WikiPageProperties properties = data.getProperties();
		WikiPageProperty symLinks = properties.set(SymbolicPage.PROPERTY_NAME);
		symLinks.set(string, string2);
		pageOne.commit(data);
	}

	private void makePages(final String string2, final String string3) {
		crawler.addPage(root, PathParser.parse(string2));
		crawler.addPage(root, PathParser.parse(string3));
	}

	private void assertNotSubString(String string, String xml) {
		// TODO Auto-generated method stub
		
	}

	private void assertResponseDoesNotContain(String string) {
		// TODO Auto-generated method stub
		
	}
	
	private void assertSubString(String string, String xml) {
		// TODO Auto-generated method stub

	}

	private void assertEquals(String string, Object contentType) {
		// TODO Auto-generated method stub

	}
}