package chap13.ex03;

public class PageIterator {
	private PageReader reader;
	private URLIterator urls;
	
	public PageIterator(PageReader reader, URLIterator urls) {
		this.reader = reader;
		this.urls = urls;
	}
	
	public synchronized String getNextPageOrNull() {
		if (urls.hasNext()) {
			return getPageFor(urls.next());
		} else {
			return null;
		}
	}

	private String getPageFor(String url) {
		return reader.getPageFor(url);
	}
}