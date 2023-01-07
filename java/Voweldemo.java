import java.util.*;
class Voweldemo
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int Vowel=0;
	String str;

	do
	{
	System.out.println("enter a sentense");
	str=sc.nextLine();
	char ch;
	for(int i=0;i<str.length();i++)
	{
		ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			Vowel++;
		}

	}
}
while(!str.equals("quit"));
	System.out.println("Vowel;"+(Vowel-2));
}


}
