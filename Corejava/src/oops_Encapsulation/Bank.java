package oops_Encapsulation;

public class Bank {
	private double balance;
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0 && amount <=balance)
		{
			balance-=amount;
		}
	}
	public double getbalance()
	{
		return balance;
	}
	public static void main(String[]args)
	{
		Bank obj=new Bank();
		obj.deposit(20000);
		obj.withdraw(5000);
		System.out.println(obj.getbalance());
	}
}
