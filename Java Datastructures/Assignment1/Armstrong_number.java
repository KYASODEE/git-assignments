package Assignment;

import java.util.Scanner;

        import static java.lang.annotation.ElementType.METHOD;
		import static java.lang.annotation.RetentionPolicy.RUNTIME;
		import java.lang.annotation.Retention;
		import java.lang.annotation.Target;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem=0 ,arm=0,n,number=0;
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		number=n;
		while(n>0)
		{
			rem=n%10;
			arm=arm+rem*rem*rem;
			n=(n/10);
		}
		if(arm==number)
			System.out.print(+number+"is a armstrong number");
		else
			System.out.print(+number+"is not a armstrong number");

	}
}


