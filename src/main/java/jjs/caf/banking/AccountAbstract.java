package jjs.caf.banking;

public abstract class AccountAbstract implements AccountVO, AccountMO {
	protected int accountNumber;
	private int balance;

	public AccountAbstract(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public int getBalance() {

		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public int getAccountNumber() {
		// TODO Auto-generated method stub
		return accountNumber;
	}

	@Override
	public void book(int amount) throws BookingVerificationFailedException {
		// TODO Auto-generated method stub
		this.verifyBookingPrecondition(amount);
			this.balance += amount;

	}

	public abstract boolean verifyBookingPrecondition(int amount) throws BookingVerificationFailedException;

	@Override
	public String toString() {
		return "SavingAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
}
