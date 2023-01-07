import java.util.Scanner;
class lab2_4{
	double r;
	public lab2_4(int r){
		this.r = r;

	}
	public double getArea(){
		return 3.14*this.r*this.r;
	}
}
class circleArea{
	public static void main(String[] args) {
	lab2_4 c1 = new lab2_4(5);
		System.out.print(c1.getArea());
	}
}	
