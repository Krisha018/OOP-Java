import java.util.Scanner;
class student
{
	int rollno;
	String name;
	int age;
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno:");
		rollno=sc.nextInt();
		System.out.println("enter name:");
		name=sc.next();
		System.out.println("enter age:");
		age=sc.nextInt();
		
	}
	void displaydata()
	{
		System.out.println("Roll no:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		}
}

class Studentdemo1
{
	public static void main(String arg[])
	{
		student s1=new student();
		student s2=new student();
		s1.setdata();
		s2.setdata();
		s1.displaydata();
		s2.displaydata();
	}
}