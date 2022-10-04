package abstraction;
interface Bank{
	void deposit(int amount);
	void withdraw(int amount);
	void checkBalance();
}
class BankImpl implements Bank{
	int bal=5000;
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		bal=bal+amount;
		System.out.println("Amount deposited succesfully:)");
	}
	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawing Rs."+amount);
		bal=bal-amount;
		System.out.println("Amount withdrwaing succesfully:)");
	}
	@Override
	public void checkBalance() {
		System.out.println("Available balance is Rs."+bal);
	}
}

public class AccountHolder {

	public static void main(String[] args) {
		Bank b=new BankImpl();
		b.checkBalance();
		System.out.println("-----------");
		b.deposit(2000);
		b.checkBalance();
		System.out.println("-----------");
		b.withdraw(3000);
		b.checkBalance();
	}

}
