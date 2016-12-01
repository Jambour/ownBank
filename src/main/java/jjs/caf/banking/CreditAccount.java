package jjs.caf.banking;

public class CreditAccount extends AccountAbstract {
	private int creditLine;

	public CreditAccount(int accountNumber) {
		super(accountNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verifyBookingPrecondition(int amount) {
		// TODO Auto-generated method stub
		return amount + getBalance() + creditLine >= 0;
	}

	public int getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}

}
