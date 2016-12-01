package jjs.caf.banking;

public class SavingAccount extends AccountAbstract {

	public SavingAccount(int accountNumber) {
		super(accountNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verifyBookingPrecondition(int amount) {
		// TODO Auto-generated method stub
		return getBalance() + amount >= 0;
	}

}
