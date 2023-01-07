import java.util.*;
public class lab3_4
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num=31;
		boolean flag=false;
		System.out.println("enter Number");
		num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(num+"is prime Number");
		}
		else
		{

			System.out.println(num+"is  not prime Number");
		}
	}
}