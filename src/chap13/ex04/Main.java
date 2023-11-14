package chap13.ex04;

public class Main {
	UrlGenerator urlGenerator;
	
	public synchronized String nextUrlOrNull() {
		if (hasNext()) {
			String url = urlGenerator.next();
			Thread.yield(); //보조 코드
			updateHasNext();
			return url;
		}
		return null;
	}

	private void updateHasNext() {
	}

	private boolean hasNext() {
		return false;
	}
}
