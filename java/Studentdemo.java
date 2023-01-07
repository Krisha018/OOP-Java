import java.util.Scanner;
class student
{
	int rollno;
	String name;
	int age;
	void setdata(int r,String n,int a)
	{
		rollno=r;
		name=n;
		age=a;

	}
	void displaydata()
	{
		System.out.println("Roll no:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		}
}

class Studentdemo
{
	public static void main(String arg[])
	{
		student s1=new student();
		s1.setdata(101,"raj",18);
		s1.displaydata();
	}
}