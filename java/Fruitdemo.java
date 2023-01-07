import java.util.Scanner;
class fruit
{
	String name;
	int price;
	String colour;
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter price");
		price=sc.nextInt();
		System.out.println("enter colour");
		colour=sc.next();
	}
	void displaydata()
	{

	System.out.println("name:"+name);
	System.out.println("price:"+price);
	System.out.println("colour:"+colour);
}
}
class Fruitdemo
{
	public static void main(String arg[])
	{
		fruit f1=new fruit();
		fruit f2=new fruit();
		f1.setdata();
		f2.setdata();
		f1.displaydata();
		f2.displaydata();
	} 

}