package chap14.ex05;

import java.util.Iterator;
import java.util.NoSuchElementException;

class IntegerArgumentMarshaler implements ArgumentMarshaler {
	private int integerValue = 0;

	public void set(Iterator<String> currentArgument) throws ArgsException {
		String parameter = null;
		try {
			parameter = currentArgument.next();
			integerValue = Integer.parseInt(parameter);
		} catch (NoSuchElementException e) {
			throw new ArgsException(ArgsException.ErrorCode.MISSING_STRING);
		} catch (NumberFormatException e) {
			throw new ArgsException(ArgsException.ErrorCode.INVALID_INTEGER, parameter);
		}
	}

	public Object get() {
		return integerValue;
	}
}