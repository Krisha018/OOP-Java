class Morning implements Runnable
{
	public void run()
	{
		System.out.println("good morning");
		try{

		Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();

		}	

	}
}
class Afternoon implements Runnable
{
	public void run()
	{
		System.out.println("good Afternoon");
		try{
		Thread.sleep(3000);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
}
public class lab9_1
{
	public static void main (String[] args)
	{
		Morning m= new Morning();
		Afternoon a=new Afternoon();
		Thread t1=new Thread(m);
		Thread t2=new Thread(a);
		t1.start();
		t2.start();

	}
}