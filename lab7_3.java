interface Transport{
	void deliver();
}
abstract class Animal{

}
class Tiger extends Animal{
	void deliver(){
		int sum=10;
	}

}
class Deer extends Animal{
	void deliver(){
		int add=10;
	}

}
class 	Camel extends Animal implements Transport{
	void deliver(){
		System.out.println("camel");
	}

}
class Donkey extends Animal implements Transport{
	void deliver(){
		System.out.println("Donkey");
	}

}
public class lab7_3{
	public static void main(String[] args){
		Tiger t=new Tiger();
		Deer m=new Deer();
		Camel c=new Camel();
		Donkey d=new Donkey();
		t.deliver();
		m.deliver();
		c.deliver();
		d.deliver();
		




	}
}
