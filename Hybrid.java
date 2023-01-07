interface A{
	
	int i=10;
}
class B implements A{
	
	int j=20;
}

interface C extends A{
	
	int k=30;
}
class D extends B implements C{
	 void sum()
	{
		
		int add=i+j+k;
		System.out.println("sum:"+add);
	}
}
public class Hybrid
{
	public static void main(String[] args){
		D obj=new D();
		obj.sum();

	}
}
	
	
