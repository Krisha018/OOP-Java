import java.util.Scanner;
class third{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter Number : ");
		num1 = sc.nextInt();
		System.out.print("Enter Number : ");
		num2 = sc.nextInt();
		String input1;
		System.out.println("1.sum 2.sub  3.div 4.mul");
		System.out.print("Enter String : ");
		input1  = sc.next();
		switch (input1) {
			case "sum":
				System.out.println("sum : "+(num1+num2));
				break;
				case "sub":
				System.out.println("sub : "+(num1-num2));
				break;
				case "mul":
				System.out.println("mul : "+(num1*num2));
				break;
				case "div":
				System.out.println("div : "+(num1/num2));
				break;
		
			default:
			System.out.println("wrong input!!");
				break;
		}
	}
}