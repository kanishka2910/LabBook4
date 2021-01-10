/**
 * 
 * @author L.S.Kanishka
 *
 */


class Account extends Person
{
	long accNum;
	double balance;
	Person accHolder;
	
	long getAccNum()
	{
		return accNum;
	}
	
	void setAccNum(long accNum)
	{
		this.accNum=(long) Math.random();
	}
	void setBalance(double balance) {
		this.balance=balance;
		if(balance<500)
		{
			System.out.println("Minimum balance is 500");
		}
	}
	void deposit(double amt)
	{
		balance=balance+amt;
	}
	double withdraw(double amt)
	{
		balance=balance-amt;
		return balance;
	}
	double getBalance()
	{
		return balance;
		
	}
}
class Person
{
	String name;
	float age;
	String getName()
	{
		return name;
		
	}
	void setName(String name)
	{
		this.name=name;
	}
	float getAge()
	{
		return age;
		
	}
	void setAge(float age)
	{
		if(age<=0)
		{
			System.out.println("Enter valid age");
		}
		this.age=age;
	}
}

class SavingsAccount extends Account
{
	final float minimumBalance = 500;
	
	@Override
	double withdraw(double amt)
	{
		if(balance<minimumBalance)
		{
			return balance;
		}
		else
		{
			return (balance-amt);
		}
	}
	
}
class CurrentAccount extends Account
{
	final float overDraftLimit=6000;
	@Override
	double withdraw(double amt)
	{
		boolean flag=true;
		if(amt>overDraftLimit)
		{
			flag=false;
			System.out.println(flag);
		}
		return amt;
		
		
	}
}

public class Exercise1 {
public static void main(String[]args)
{
	Account acc1=new Account();
	//Person p1=new Person();
	acc1.setName("Smith");
	System.out.println("Account Holder Name="+acc1.getName());
	acc1.setBalance(2000);
	System.out.println("Current Balance"+acc1.getBalance());
	Account acc2= new Account();
	acc2.setName("Kathy");
	System.out.println("Account Holder Name="+acc2.getName());
	acc2.setBalance(3000);
	System.out.println("Current Balance"+acc2.getBalance());
	acc1.deposit(2000);
	System.out.println("Updated Balance"+acc1.getBalance());
	acc2.withdraw(2000);
	System.out.println("Updated Balance"+acc2.getBalance());
}
	

}
