package internshipTasks;
import java.util.Scanner;

public class ATM extends BankAccount{
	private BankAccount account;
	
	 public ATM(BankAccount account) {
	        this.account = account;
	    }

	    public void start() {
	        Scanner scanner = new Scanner(System.in);
	        boolean running = true;
	        
	        System.out.println("ATM MACHINE\n\nLogin Required!");
	        System.out.print("ENTER YOUR USERNAME: ");
			String name = scanner.next();
			System.out.printf("Succesful Login✅\n\nHi %s,\nWhat would you like to do with your account today\n", name.toUpperCase());
			
	        while (running) {
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check balance");
	            System.out.println("4. Exit");
	            System.out.print("Please choose an option: ");
	            int option = scanner.nextInt();
	            double amount;

	            
	            switch (option) {
				case 1:
					System.out.print("\nEnter amount to withdraw:");
	                amount = scanner.nextDouble();
	                this.account.withdraw(amount);	              
					break;
				case 2:
					System.out.print("\nEnter amount to deposit:");
	                amount = scanner.nextDouble();
	                this.account.deposit(amount);
					break;
				case 3:
	                System.out.println("\nYour account balance is " + this.account.getBalance() + "\n\nAnything else?");
					break;
				case 4:
	                System.out.printf("Thank you for using our ATM. Goodbye %s👋\n",name.toUpperCase());
	                running = false;
					break;
				default:
	                System.out.println("Invalid option. Please try again.");
					break;
				}
	    }
	        scanner.close();

}
	
}