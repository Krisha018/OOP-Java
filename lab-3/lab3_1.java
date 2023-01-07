import java.util.*;
public class lab3_1
{
    public static void main(String[] args) 
    {
        int n, total = 0, percentage;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i = 0; i < n; i++)
        {
            marks[i] = s.nextInt();
            total = total + marks[i];
        }
        percentage = total / n;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+percentage);
        if(percentage>60){
            System.out.println("first division");
        }
        else if(percentage<=50||percentage>59)
        {
            System.out.println("second division");
        
        }
        else if(percentage<=40||percentage>49){
            System.out.println("third division");
        }
        else 
        {
            System.out.println("fail");
        }
    }
}
