import java.util.*;
abstract class Veg
{
	public abstract String tostring();
}
class potato extends Veg{
public String tostring()
{
	String p="potat-yellow";
	return p;
}
}
class brinjal extends Veg{
	public String tostring()
{
	String b="brinjal-purple";
	return b;
}
}
class tomato extends Veg{
	public String tostring()
{
	String t="tomato-red";
	return t;
}
}
public class Vegdemo
{
	public static void main(String args[])
	{
		Veg v=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		switch (name)
		{
			case "potato":
			v=new potato();
			break;

			case "brinjal":
			v=new brinjal();
			break;

			case "tomato":
			v=new tomato();
			break;

		}
		System.out.println("color:"+v.tostring());

	}
}


