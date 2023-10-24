package chap11.ex02;

import java.util.ArrayList;
import java.util.Collection;

//POJO 순수자바객체
public class BankImpl implements Bank{
	private Collection<Account> accounts;
	
	public Collection<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Collection<Account> accounts) {
		//방어적 복사
		this.accounts = new ArrayList<>();
		for (Account a : accounts) {
			this.accounts.add(a);
		}
	}
}
