import java.util.*;
public class lab3_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=0,reminder,temp;
		temp=num;
		System.out.println("enter Number");
		num=sc.nextInt();

		while(temp!=0)
		{
			reminder=temp%10;
			num=num*10+reminder;
			temp=temp/10;
		}
		if(num==num)
		{
			System.out.println(num+"is palindrome");
		}
		else
		{

			System.out.println(num+"is not palindrome");

		}
	}
}