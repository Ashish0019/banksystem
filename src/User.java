import java.util.Scanner;

public class User {

	Scanner sc1 = new Scanner(System.in);
	private static double amount, crd, newamt, withdraw;
	String Username, Password, Password2;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public void userInput() {

		int exit = 0;
		do {

			System.out.println("Enter 1,2,3");
			System.out.println("1. New user ");
			System.out.println("2. Existing user");
			System.out.println("3. back");

			char ch1 = sc1.next().charAt(0);

			switch (ch1) {
			case '1':
				User obj = new User();
				obj.Nu();

				break;
			case '2':
				ExistingUser obj2 = new ExistingUser();
				obj2.Eu();
				break;

			case '3':
				exit = 1;
				break;
			default:
				System.out.println("Wrong Input");
			}
		} while (exit != 1);
		
	}

	public void Nu() {

		System.out.println("New User");
		System.out.println("Enter Details");
		System.out.print("User name");
		 Username = sc1.nextLine();
		System.out.println("User name is " + Username);

		System.out.print("address");
		String address = sc1.nextLine();
		System.out.println("address is " + address);
		System.out.println("Choose type of account");
		System.out.println("1. Saving");
		System.out.println("2. Current");

		char ch2 = sc1.next().charAt(0);
		switch (ch2) {
		case '1':

			User obj3 = new User();
			obj3.savNu();
			break;
		case '2':
			User obj4 = new User();
			obj4.currNu();
			break;
		default:
			System.out.println("Wrong Input");

		}

	}
	public void sav() {
		System.out.println("Saving account");
		System.out.println("Enter Credentials");
		System.out.print("User name");
		 Username = sc1.nextLine();
		System.out.println("User name is " + Username);
		int exit = 0;
		
		do {
			

			System.out.println("Initial amount" + amount);
			System.out.println("What do you want to do?");
			System.out.println("1. withdraw");
			System.out.println("2. deposit");
			System.out.println("3. back");
			char ch2 = sc1.next().charAt(0);
			switch (ch2) {
			case '1':

				User obj5 = new User();
				obj5.withdraw();
				break;
			case '2':
				User obj6 = new User();
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
		 Username = sc1.nextLine();
		System.out.println("User name is " + Username);
		int exit = 0;
		do {


			System.out.println("Initial amount" + this.amount);
			System.out.println("What do you want to do?");
			System.out.println("1. withdraw");
			System.out.println("2. deposit");
			System.out.println("3. back");
			char ch2 = sc1.next().charAt(0);
			switch (ch2) {
			case '1':
				User obj7 = new User();
				obj7.withdraw();
				break;
			case '2':
				User obj8 = new User();
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
		String abc1 = sc1.next();

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

		 String again = sc1.next();
		dep = again.equalsIgnoreCase("y");
		} return;
	}

	public void withdraw() {
		boolean dep = true;
		 while (dep) {
		System.out.println("Enter amount you want to withdraw");
		String abc1 = sc1.next();

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

		String again = sc1.next();
		dep = again.equalsIgnoreCase("y");
		
	}

	public void initamount() {
		String abc = sc1.next();

		try {
			amount = Double.parseDouble(abc);
		} catch (Exception e) {
			System.out.println("provide valid input");
			return;
		}

		System.out.println("Initial amount" + amount);

	}

	public void currNu() {

		System.out.println("Currenr account");
	

		System.out.println("User name is " + Username);


			System.out.println("Initial amount" + amount);
			System.out.println("What do you want to do?");
			System.out.println("1. withdraw");
			System.out.println("2. deposit");
			char ch2 = sc1.next().charAt(0);
			switch (ch2) {
			case '1':

				User obj5 = new User();
				obj5.withdraw();
				break;
			case '2':
				User obj6 = new User();
				obj6.deposit();
				break;
			default:
				System.out.println("Wrong Input");
			}

		}

		
	

	public void savNu() {

		System.out.println("Saving account");
		
			System.out.println("Initial amount" + amount);
			System.out.println("What do you want to do?");
			System.out.println("1. withdraw");
			System.out.println("2. deposit");
			char ch2 = sc1.next().charAt(0);
			switch (ch2) {
			case '1':

				User obj5 = new User();
				obj5.withdraw();
				break;
			case '2':
				User obj6 = new User();
				obj6.deposit();
				break;
			default:
				System.out.println("Wrong Input");
			}

		}
	
	public void display(){
		System.out.println(Username+" "+amount);
	}

		

}
