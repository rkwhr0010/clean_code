package chap11.ex02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;

public class BankProxyHandler implements InvocationHandler{
	private Bank bank;
	
	public BankProxyHandler(Bank bank) {
		this.bank = bank;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		if (methodName.equals("getAccounts")) {
			bank.setAccounts(getAccountsFromDatabase());
			return bank.getAccounts();
		} else if (methodName.equals("setAccounts")) {
			bank.setAccounts((Collection<Account>) args[0]);
			setAccountsToDatabase(bank.getAccounts());
			return null;
		} else {
			// 기타 메서드...
			return null;
		}
	}
	//세부사항
	protected void setAccountsToDatabase(Collection<Account> accounts) {
	}
	protected Collection<Account> getAccountsFromDatabase() {
		return null;
	}
}
