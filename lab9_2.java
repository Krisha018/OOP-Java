class odd extends Thread{
	public void run()
	{
		for(int i=1; i<=20;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
	}
}
class even extends Thread{
	public void run()
	{
		for(int i=1; i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class lab9_2
{
	public static void main(String[] args)
	{
		odd o=new odd();
		even e=new even();
		o.start();
		e.start();
		
	}
}
