package kbc1;

import java.util.Scanner;


public class lifeline
{
        public int i=0,l=3;
	public int rans=0,flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,f=0;
	public int lifeline_menu(int i)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lifeline required:\n1.Fifty:fifty\n2.Ask the expert\n3.Change the question\n4.Go back to current question.");
		int x=sc.nextInt();
		switch(x)
		{
		case 1:fifty(i);
			return i;// so that it can go back to the subclass question method (subclass method cant be called in superclass)
		case 2:expert(rans,i);
			return i;//same as above
		case 3:change(i);
			f=1;//condition to check whether question 10 has to be called
			return i;//not return 10 coz value of i changes
		case 4:flag5=1;//condition to check whether same question has to be called again
			return i;
			//question(i); 
		default:System.out.println("Invalid input. Please select again.");
			lifeline_menu(i);
			break;
		}
                return -1;//has to have some return value
	}
	public void fifty(int i)
	{
		if(flag1==1)
		{
			System.out.println("You have already used this lifeline. Please choose again.\n\n");
			lifeline_menu(i);
		}
		else
		{
			double opt1=Math.random()*100%4;
			int op=(int)opt1;
			if(op==0)
				op+=4;
			if(op==rans)
			{
				fifty(i);
			}
		
			else if(op<rans)
				System.out.println("The two possible correct options are:\n["+op+"]\t["+rans+"]");
			else
				System.out.println("The two possible correct options are:\n["+rans+"]\t["+op+"]");
			flag1=1;
			//answer(i);
		}
	}
	public void expert(int rans,int i)
	{
		if(flag2==1)
		{
			System.out.println("You have already used this lifeline. Please choose again.");
			lifeline_menu(i);
		}
                else
                {
                    System.out.println("Today's expert says the right answer is: "+rans);
                    flag2=1;
                }
		//answer(i);
	}
	public void change(int i)
	{
		if(flag3==1)
		{
			System.out.println("\n\n\nYou have already used this lifeline. Please choose again.\n\n");
			lifeline_menu(i);
		}
		flag3=1;
                flag4=1;
		//question(10);
	}

}