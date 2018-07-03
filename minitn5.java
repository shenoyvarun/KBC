import kbc1.*;
import kbc2.*;
import java.io.Console;
import java.util.*;

public class minitn5
{
        public static void main(String[] args) 
	{
        Console console = System.console();
		qb q=new qb();
		lifeline lf=new lifeline();
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Kindly enter your name.");
		String name=sc.nextLine();
		System.out.println("\nThis is a paid version only. If you are a registered user, kindly enter your password.\n");
		System.out.println("Password will not be visible on screen for security reasons");
		char[] passwordChars = console.readPassword();
        String passwordString = new String(passwordChars);
        String right="abcde";
       	if(passwordString.compareTo(right)==0)
       	System.out.println("Hello\t"+name+"\nWelcome to Kaun Banega Crorepati.\nShall we begin?\n1.Yes\t2.No");
       	else
       	{
       	System.out.println("Wrong password. Please try again.");
       	main(args);
       	}
		int play=sc.nextInt();
		if(play==1)
		{
			q.question(i);
		}
		else if(play==2)
			System.out.println("Thank you for not playing. It's a huge compliment.");
		else
		{
			System.out.println("Invalid input. Please select again.");
			main(args);
		}
		if(q.ex==1)
		{
				lf.i=0;
                                q.j=-1;
				lf.l=3;
				q.money=0;
				lf.flag1=0;
				lf.flag2=0;
				lf.flag3=0;
				lf.flag4=lf.flag5=0;
				main(args);
		}
		else if(q.ex==0)
			System.exit(0);
		else
			System.exit(0);	
	}
}