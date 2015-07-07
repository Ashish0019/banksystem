import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.lang.String;

public class bms {

	static List<User> users;

	public static void main(String args[])

	{

		users = new ArrayList<User>();
		int exit = 0;
		do {
			System.out.println("Welcome to BMS");
			System.out.println("Enter 1,2");
		
			System.out.println("1. users");

			System.out.println("2. Disp");
			System.out.println("Any other value will restart");

			Scanner sc = new Scanner(System.in);
			char ch = sc.next().charAt(0);
			System.out.println("Enter username ");
			String myname = sc.nextLine();

			switch (ch) {
		
			case '1':
				User abc = new User();
				abc.userInput();
				users.add(abc);

				for (int i = 0; i < users.size(); ++i) 
				{
					if (myname.equals(users.get(i).getUsername()))
					{
						System.out.println("user found");
					} 
					else 
					{
						System.out.println("user not found");
					}
				}
				break;
			case '2': disp();
						break;

			case '3':
				exit = 1;
				break;

			default:
				System.out.print("please enter correct value");

			}
		} while (exit != 1);
	}

	private static void disp() {
		// TODO Auto-generated method stub
		for(int i=0;i<users.size();++i){
			users.get(i).display();
		}
		
	}
	

}
