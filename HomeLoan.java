public class HomeLoan extends Loan
{
	double propertyvalue;
	double downPayment;
	double monthlyIncome;
	double principalamount;

	public double calculateoffederableEmi()
	{
		double time=0;
		return (principalamount*interest*Math.pow(1+interest,time))/(Math.pow(1+interest,time)-1);
	}
	
	public void setLoanAmt()
	{
		loanamount=propertyvalue-downPayment;
	}
	
	public double loantenure()
	{
		return loanamount+(loanamount*interest/100)/calculateoffederableEmi();
	}
	
	public void setPropertyvalue(double propertyvalue) {
		this.propertyvalue = propertyvalue;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	
	public String toString()
	{
		return propertyvalue+""+downPayment+""+monthlyIncome;
	}
}
