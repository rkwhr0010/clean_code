package chap11.ex02;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		//사용하는 코드...
		Bank bank = (Bank) Proxy.newProxyInstance(Bank.class.getClassLoader(), 
				new Class[] {Bank.class}, 
				new BankProxyHandler(new BankImpl()));
	}
}
