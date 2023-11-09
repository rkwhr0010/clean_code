package chap13.ex03;

//URL 하나를 받아 해당 페이지 내용을 반환한다.
public class PageReader {
	// ...
	HttpClientImpl httpClient = new HttpClientImpl();
	
	public String getPageFor(String url) {
		HttpMethod method = new GetMethod(url);
		
		try {
			httpClient.executeMethod(method);
			String response = method.getResponseBodyAsString();
			return response;
		} catch (Exception e) {
			return handle(e);
		} finally {
			method.releaseConnection();
		}
	}

	private String handle(Exception e) {
		return "";
	}
}
