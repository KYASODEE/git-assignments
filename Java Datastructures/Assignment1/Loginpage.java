package Assignment;

import java.util.Scanner;

public class Loginpage {

	public Loginpage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
			String sp=" ";
			System.out.println("Enter the username:");
			String uname = sc.nextLine();
			if((uname.contains(sp)) || uname.length()<4) {
			System.out.println("Invalid Username");
			return;
			}
			System.out.println("Enter the Password");
			String upass = sc.nextLine();
			if((upass.contains(sp)) || upass.length()<8) {
			System.out.println("Invalid Password");
			return;
			}
			System.out.println(uname+"you are Registered Successfully");
			System.out.println("Enter the Username");
			String lname = sc.nextLine();
			System.out.println("Enter the Password");
			String lpass = sc.nextLine();
			if(uname.equals(lname) && upass.equals(lpass)) {
			System.out.println("Welcome"+lname);
			}
			else {
			System.out.println("Username or Password Invalid Please contact admin");

			}

			}

			}


