import java.util.Scanner;
class first{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter Number : ");
		num1 = sc.nextInt();
		System.out.print("Enter Number : ");
		num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.print("your sum is  : "+sum);
	}
}