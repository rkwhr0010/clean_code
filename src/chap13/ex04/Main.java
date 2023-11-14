package chap13.ex04;

public class Main {
	UrlGenerator urlGenerator;
	
	public synchronized String nextUrlOrNull() {
		if (hasNext()) {
			ThreadJigglePoint.jiggle();
			String url = urlGenerator.next();
			ThreadJigglePoint.jiggle();
			updateHasNext();
			ThreadJigglePoint.jiggle();
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
