public class Loan {
	
	double loanamount;
	double interest;
	
	public double getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public String toString()
	{
		return loanamount+""+interest;
		
	}
	
}
