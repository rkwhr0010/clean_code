package chap11.ex02;

import java.util.Collection;

public interface Bank {
	Collection<Account> getAccounts();
	void setAccounts(Collection<Account> accounts);
}
