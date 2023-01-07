import java.util.Scanner;
class Complexno{
	int real;
	int imaginary;
	Complexno()
	{
		real=1;
		imaginary=1;
	}
	Complexno(int a, int b)
	{
		real=a;
		imaginary=b;
	}
	void display()
	{
		System.out.println(real+"+"+imaginary+"i");
	}
	Complexno add(Complexno z)
	{
		Complexno temp=new Complexno();
		temp.real=real+z.real;
		temp.imaginary=imaginary+z.imaginary;
		return temp;
	}
}
class lab5_5{
	public static void main(String[] args) {
		Complexno obj1=new Complexno(5,6);
		obj1.display();
		Complexno obj2=new Complexno(6,5);
		obj2.display();
	Complexno obj3=new Complexno();
		obj3=obj1.add(obj2);
		obj3.display();
	}
}