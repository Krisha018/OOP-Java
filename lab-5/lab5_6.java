public class lab5_6 {
	static int count;
	lab5_6(){
		count++;
	}
	void print(){
		System.out.print("Number Of Object : " + count);
	}
	public static void main(String args[])
	{
		lab5_6 s1 = new lab5_6();
		lab5_6 s2 = new lab5_6();
		lab5_6 s3 = new lab5_6();
		lab5_6 s4 = new lab5_6();
		lab5_6 s5 = new lab5_6();
		lab5_6 s6 = new lab5_6();
		s6.print();
	}
}
