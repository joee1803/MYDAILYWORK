package internshipTasks;

import java.util.InputMismatchException;


public class Cashpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BankAccount account = new BankAccount();
			ATM machine = new ATM(account);
			machine.start();
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Invalid Input Entered😢💔! Re-run this program.");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("An error occured😢💔! Re-run this program.");
		}

	}

}
