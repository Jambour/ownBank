package jjs.caf.banking;

public interface AccountVO extends AccountMO {

	void book(int amount) throws BookingVerificationFailedException;
}
