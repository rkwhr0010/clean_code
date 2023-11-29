package chap14.ex05;

import java.util.Iterator;

interface ArgumentMarshaler {
	public abstract void set(Iterator<String> currentArgument) throws ArgsException;

	public abstract Object get();
}