import java.util.Scanner;
class CircleOfAreaDemo{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter r");
		float r=input.nextFloat();
		CircleOfArea sc=new CircleOfArea();
		sc.area(r);
		
	}
}
