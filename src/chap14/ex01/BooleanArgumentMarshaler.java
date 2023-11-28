package chap14.ex01;

import java.util.*;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
	private boolean booleanValue = false;

	public void set(Iterator<String> currentArgument) throws ArgsException {
		booleanValue = true;
	}

	public static boolean getValue(ArgumentMarshaler am) {
		if (am != null && am instanceof BooleanArgumentMarshaler)
			return ((BooleanArgumentMarshaler) am).booleanValue;
		else
			return false;
	}
}