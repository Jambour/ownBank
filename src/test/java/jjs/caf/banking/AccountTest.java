package jjs.caf.banking;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

	@Test
	public void BookWithPostiveAmount() throws Exception {
		SavingAccount account = new SavingAccount(10);
		Assert.assertEquals(1, account.getBalance());
		int amount = 100;
		account.book(amount);
		Assert.assertEquals(amount, account.getBalance());
	}


}
