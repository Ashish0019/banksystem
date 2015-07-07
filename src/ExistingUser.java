import java.util.Scanner;
public class ExistingUser {
	
	private static double amount, crd, newamt, withdraw;
	String Username, Password, Password2;
	Scanner sc2 = new Scanner(System.in);	

	public void Eu() {

		System.out.println("Type of account");
		System.out.println("1. Saving");
		System.out.println("2. Current");
		char ch2 = sc2.next().charAt(0);
		switch (ch2) {
		case '1':

			ExistingUser obj3 = new ExistingUser();
			obj3.sav();
			break;
		case '2':
			ExistingUser obj4 = new ExistingUser();
			obj4.curr();
			break;
		default:
			System.out.println("Wrong Input");
		}

	}

	public void sav() {
		System.out.println("Saving account");
		System.out.println("Enter Credentials");
		System.out.print("User name");
		 Username = sc2.nextLine();
		System.out.println("User name is " + Username);
		int exit = 0;
		
		do {
			

			System.out.println("Initial amount" + amount);
			System.out.println("What do you want to do?");
			System.out.println("1. withdraw");
			System.out.println("2. deposit");
			System.out.println("3. back");
			char ch2 = sc2.next().charAt(0);
			switch (ch2) {
			case '1':

				ExistingUser obj5 = new ExistingUser();
				obj5.withdraw();
				break;
			case '2':
				ExistingUser obj6 = new ExistingUser();
				obj6.deposit();
				break;
			case '3':
				exit = 1;
				break;
			default:
				System.out.println("Wrong Input");
			}
		} while (exit != 1);
	}

	public void curr() {
		System.out.println("Current account");
		System.out.println("Enter Credentials");
		System.out.print("User name");
		 Username = sc2.nextLine();
		System.out.println("User name is " + Username);
		int exit = 0;
		do {


			System.out.println("Initial amount" + this.amount);
			System.out.println("What do you want to do?");
			System.out.println("1. withdraw");
			System.out.println("2. deposit");
			System.out.println("3. back");
			char ch2 = sc2.next().charAt(0);
			switch (ch2) {
			case '1':
				ExistingUser obj7 = new ExistingUser();
				obj7.withdraw();
				break;
			case '2':
				ExistingUser obj8 = new ExistingUser();
				obj8.deposit();
				break;
			case '3':
				exit = 1;
				break;
			default:
				System.out.println("Wrong Input");
			}
		} while (exit != 1);
	}

	public void deposit() {
		boolean dep = true;
		while (dep) {

		System.out.println("Enter amount you want to deposit");
		String abc1 = sc2.next();

		try {
			crd = Double.parseDouble(abc1);
		} catch (Exception e) {
			System.out.println("provide valid input");
			return;
		}

		System.out.println("Amount Deposited" + crd);
		this.amount = crd + amount;
		System.out.println("New amount" + this.amount);

	 System.out.println("Do you wish to deposit again? Y/N");

		 String again = sc2.next();
		dep = again.equalsIgnoreCase("y");
		} return;
	}

	public void withdraw() {
		boolean dep = true;
		 while (dep) {
		System.out.println("Enter amount you want to withdraw");
		String abc1 = sc2.next();

		try {
			withdraw = Double.parseDouble(abc1);
		} catch (Exception e) {
			System.out.println("provide valid input");
			return;
		}

		if (withdraw > amount) {

			System.out.println("low balance");

		} else {

			System.out.println(" amount" + withdraw);
			System.out.println("withdraw initiated");

			this.newamt = amount - withdraw;
			System.out.println("New amount" + this.newamt);

		}return;
		}
	 System.out.println("Do you wish to again? Y/N");

		String again = sc2.next();
		dep = again.equalsIgnoreCase("y");
		
	}
}

