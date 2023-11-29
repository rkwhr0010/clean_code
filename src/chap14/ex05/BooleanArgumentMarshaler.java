package chap14.ex05;

import java.util.Iterator;

class BooleanArgumentMarshaler implements ArgumentMarshaler {
	private boolean booleanValue = false;

	public void set(Iterator<String> currentArgument) throws ArgsException {
		booleanValue = true;
	}

	public Object get() {
		return booleanValue;
	}
}