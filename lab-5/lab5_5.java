public class lab5_5{
   double real, img;
	
   lab5_5(double r, double i){
	this.real = r;
	this.img = i;
   }
	
   public static lab5_5 sum(lab5_5 c1, lab5_5 c2)
   {
        lab5_5 temp = new lab5_5(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        
        return temp;
    }
    public static void main(String args[]) {
	lab5_5 c1 = new lab5_5(5.5, 4);
	lab5_5 c2 = new lab5_5(1.2, 3.5);
        lab5_5 temp = sum(c1, c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
    }
}