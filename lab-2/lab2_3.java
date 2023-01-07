import java.util.*;
public class lab2_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("enter number:");
		num1=sc.nextInt();
		System.out.println("enter number:");
		num2=sc.nextInt();
		String input1;
		System.out.println("1.sum 2.sub 3.multi 4.div");
		System.out.println("enter string");
		input1=sc.next();
		switch(input1)
		{
		case "sum":
			System.out.println("sum:"+(num1+num2));
			break;

		case "sub":
			System.out.println("sub:"+(num1-num2));
			break;
			
		case "multi":
			System.out.println("sum:"+(num1*num2));
			break;
			
		case "div":
			System.out.println("sum:"+(num1/num2));
			break;
		default:
			System.out.println("wrong input!!");
			break;

			


		}
		
	}

}