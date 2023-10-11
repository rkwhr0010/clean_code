package chap09.ex01;

public class SerializedPageResponderTest extends RegexTest {
	private final String RootPath = "TestRooT";
	private PageCrawler crawler;
	private WikiPage root;
	private MockRequest request;

	public void testGetPageHieratchyAsXml() throws Exception {
		crawler.addPage(root, PathParser.parse("PageOne"));
		crawler.addPage(root, PathParser.parse("PageOne.ChildOne"));
		crawler.addPage(root, PathParser.parse("PageTwo"));

		request.setResource("root");
		request.addInput("type", "pages");
		Responder responder = new SerializedPageResponder();
		SimpleResponse response = (SimpleResponse) responder.makeResponse(new FitNesseContext(root), request);
		String xml = response.getContent();

		assertEquals("text/xml", response.getContentType());
		assertSubString("<name>PageOne</name>", xml);
		assertSubString("<name>PageTwo</name>", xml);
		assertSubString("<name>ChildOne</name>", xml);
	}

	public void testGetPageHieratchyAsXmlDoesntContainSymbolicLinks() throws Exception {
		WikiPage pageOne = crawler.addPage(root, PathParser.parse("PageOne"));
		crawler.addPage(root, PathParser.parse("PageOne.ChildOne"));
		crawler.addPage(root, PathParser.parse("PageTwo"));

		PageData data = pageOne.getData();
		WikiPageProperties properties = data.getProperties();
		WikiPageProperty symLinks = properties.set(SymbolicPage.PROPERTY_NAME);
		symLinks.set("SymPage", "PageTwo");
		pageOne.commit(data);

		request.setResource("root");
		request.addInput("type", "pages");
		Responder responder = new SerializedPageResponder();
		SimpleResponse response = (SimpleResponse) responder.makeResponse(new FitNesseContext(root), request);
		String xml = response.getContent();

		assertEquals("text/xml", response.getContentType());
		assertSubString("<name>PageOne</name>", xml);
		assertSubString("<name>PageTwo</name>", xml);
		assertSubString("<name>ChildOne</name>", xml);
		assertNotSubString("SymPage", xml);
	}

	private void assertNotSubString(String string, String xml) {
		// TODO Auto-generated method stub
		
	}

	public void testGetDataAsHtml() throws Exception {
		crawler.addPage(root, PathParser.parse("TestPageOne"), "test page");

		request.setResource("TestPageOne");
		request.addInput("type", "data");
		Responder responder = new SerializedPageResponder();
		SimpleResponse response = (SimpleResponse) responder.makeResponse(new FitNesseContext(root), request);
		String xml = response.getContent();

		assertEquals("text/xml", response.getContentType());
		assertSubString("test page", xml);
		assertSubString("<Test", xml);
	}
	
	
	private void assertSubString(String string, String xml) {
		// TODO Auto-generated method stub

	}

	private void assertEquals(String string, Object contentType) {
		// TODO Auto-generated method stub

	}
}