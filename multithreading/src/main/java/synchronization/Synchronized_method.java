package synchronization;

class Account 
{
	int balance=5000;
	synchronized void withdraw(int amount)
	{
		if(balance >=amount)
		{
			System.out.println(Thread.currentThread().getName()+" is withdrwaing "+amount);
			balance=balance-amount;
			System.out.println("amount "+balance);
		}
		else 
		{
			System.out.println(Thread.currentThread().getName()+" -Inshufiant balance");
		}
	}
}
class WithdrawTaask implements Runnable
{
	Account account;
	int amount;
	
	public WithdrawTaask(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	public void run()
	{
		account.withdraw(amount);
	}
}
public class Synchronized_method {
public static void main(String[]args)
{
	Account account =new Account();
	Runnable task1=new WithdrawTaask(account, 3000);
	Runnable task2=new WithdrawTaask(account,3000);
	
	Thread t1=new Thread(task1);
	Thread t2=new Thread(task2);
	t1.start();
	t2.start();
	
}
}
