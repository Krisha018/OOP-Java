import java.util.*;
public class Lab_5_1
{
	 float circleArea(int r)
	{
		float ans=3.14f*r*r;
		return ans;
	}
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter r");
		int r=input.nextInt();
		Area obj1=new Area();
		float ans=obj1.circleArea(int r);
		System.out.println("area of circlr="+ans);

	}
}