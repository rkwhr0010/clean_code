package chap14.ex05;

import java.util.Iterator;
import java.util.NoSuchElementException;

class StringArgumentMarshaler implements ArgumentMarshaler {
	private String stringValue;

	public void set(Iterator<String> currentArgument) throws ArgsException {
		try {
			stringValue = currentArgument.next();
		} catch (NoSuchElementException e) {
			throw new ArgsException(ArgsException.ErrorCode.MISSING_INTEGER);
		}
	}

	public Object get() {
		return stringValue;
	}
}