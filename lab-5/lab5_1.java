import java.util.*;
public class lab5_1 
{
	public static float Area (float r)
	{
		float ans=3.14f*r*r;
		return ans;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter r");
		float r=sc.nextFloat();
		lab5_1 obj=new lab5_1();
		float ans=Area(r);
		System.out.println("Area:"+ans);


		
	
	}

}