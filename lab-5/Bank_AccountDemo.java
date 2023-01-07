import java.util.*;
class lab5_4
{

	int accoutno;
	String username;
	String email;
	String acounttype;
	int acountbalance;
	 void getAccountDetails()
	 {
	 	Scanner sc= new Scanner(System.in);
	 	System.out.println("enter accout no:");
	 	accoutno=sc.nextInt();
	 	System.out.println("enter username:");
	 	username=sc.next();
	 	System.out.println("enter email:");
	 	email=sc.next();
	 	System.out.println("enter account type:");
	 	acounttype=sc.next();
	 	System.out.println("enter account balance:");
	 	acountbalance=sc.nextInt();

	 }
	 void displayAccountDetails()
	 {
	 	System.out.println("accoutno="+accoutno);
	 	System.out.println("username="+username);
	 	System.out.println("email="+email);
	 	System.out.println("acounttype="+acounttype);
	 	System.out.println("acountbalance="+acountbalance);
	 }
}
public class Bank_AccountDemo{
	public static void main(String[] args) {
			lab5_4 b1=new lab5_4();
			b1.getAccountDetails();
			b1.displayAccountDetails();
	}
}
