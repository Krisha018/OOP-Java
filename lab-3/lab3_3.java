import java.util.*;
public class lab3_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("enter Number");
		n1=sc.nextInt();
		System.out.println("enter Number");
		n2=sc.nextInt();
		System.out.println("enter Number");
		n3=sc.nextInt();

		if(n1>=n2 && n1>=n3)
		{
			System.out.println(n1+"is the largest Number");
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println(n2+"is the largest Number");
		}
		else{
			System.out.println(n3+"is the largest Number");  \
		}

	}
	

}
