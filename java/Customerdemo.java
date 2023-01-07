import java.util.Scanner;
class customer
{
	int id;
	String name;
	String mobileno;
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		id=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter mobileno");
		mobileno=sc.next();
		}
		void displaydata()
		{
			System.out.println("id:"+id);
			System.out.println("name:"+name);
			System.out.println("mobileno:"+mobileno);

		}
}
class Customerdemo
{
	public static void main (String arg[])
	{
		customer c1=new customer();
		customer c2=new customer();
		c1.setdata();
		c2.setdata();
		c1.displaydata();
		c2.displaydata();
	}
}