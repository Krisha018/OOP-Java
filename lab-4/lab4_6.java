import java.util.*;
public class lab4_6{
	public static void main(String[] args){
		String str = "stream";
		int i, j, row = 6;  
		for (i=0; i<row; i++)   
		{  
   
			for (j=row-i; j>1; j--)   
				{  

					System.out.print(" ");   
				}   

				for (j=0; j<=i; j++ )   
			    {   
      
					System.out.print("" + str.charAt(j)+" ");   
				}   
  
					System.out.println();   
			}   
    }   
}
