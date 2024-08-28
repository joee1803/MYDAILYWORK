package internshipTasks;

import java.text.NumberFormat;

public class BankAccount {
	private double balance;
    NumberFormat currency = NumberFormat.getCurrencyInstance();

	BankAccount(){
		this.balance = 0;
	}
	BankAccount(double amount){
		this.balance = amount;
	}
	
	public String getBalance(){
		return currency.format(this.balance);
	}
	public void deposit(double amount){
		this.balance += amount;
        System.out.println("Succesful deposit.✅\nYour balance has been updated.\n\nAnything else?");
	}
	public void withdraw(double amount){
		if(this.balance > amount) {			
			this.balance -= amount;
            System.out.println("Successful withdrawal✅\nYour balance has been updated. Please take your cash.\n\nAnything else?");

		}else 
			System.out.println("Error! Insufficient funds for this transaction\n\nAnything else?");
		
	}
}
