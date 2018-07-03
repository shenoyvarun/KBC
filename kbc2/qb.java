package kbc2;
import kbc1.*;
import java.util.*;
public class qb extends lifeline
{
	public static String[] args =null;
	public int money=0,j=-1,ex;
	public int r[]=new int[11];
	
	Scanner sc=new Scanner(System.in);
        public int num_random()
        {
                    ++j;
                    double r1=Math.random()*100;
                    r[j]=((int)r1)%10;	
					
                    for(int k=0;k<j;k++)
                    {
                        if(r[k]==r[j])
                        {   
                               --j;
int g=num_random();
return g;
			  //r[j]=num_random();
        //return r[j];
                        }
                    }
                
		    return r[j];
        }
	public void question(int i)
	{
                if(flag4!=1&&flag5!=1)
                {
                    i=num_random();
                                
}
                flag4=flag5=0;
		switch(i)
		{
			case 0:System.out.println("Q.)\nWhat also is a nick name for The United States presidential state car?");
				option(i);
				break;
			case 1:System.out.println("Q.)\nWho was the first President of independent India?");
				option(i);
				break;
			case 2:System.out.println("Q.)\nWhat city is the financial Capital of India?");
				option(i);
				break;
			case 3:System.out.println("Q.)\nWhich American, along with Steve Jobs, co-founded Apple?");
				option(i);
				break;
			case 4:System.out.println("Q.)\nWhich player currently posseses the maximum number of FIFA Ballon d'Or awards?");
				option(i);
				break;
			case 5:System.out.println("Q.)\nWhich building is currently the tallest building in the world?");
				option(i);
				break;
			case 6:System.out.println("Q.)\nOn the basis of area, which country is the largest country is the world?");
				option(i);
				break;
			case 7:System.out.println("Q.)\nWhich Indian-American business executive is currently the CEO of the world's largest search engine?");
				option(i);
				break;
			case 8:System.out.println("Q.)\nWhich cricketer currently holds the record for the highest batting average in test matches?");
				option(i);
				break;
			case 9:System.out.println("Q.)\nWho is currently the President of the People's Republic of China?");
				option(i);
				break;
			case 10:System.out.println("Q.)\nWhich Computer Scientist was the creator of the programming language called 'C'?");
				option(i);
				break;
		}
		
	}	
	public void option(int i)
        {
		switch(i)
		{
			case 0:System.out.println("1=Beast\t2=Leopard\n3=King\t4=Car One\n");
				answer(i);
				break;
			case 1:System.out.println("1=Jawaharlal Nehru\t2=MK Gandhi\n3=Rajendra Prasad\t4=Bhagat Singh\n");
				answer(i);
				break;
			case 2:System.out.println("1=New Delhi\t2=Kolkata\n3=Bangalore\t4=Mumbai\n");
				answer(i);
				break;
			case 3:System.out.println("1=Leonard Bosack\t2=Bill Gates\n3=Evan Williams\t4=Steve Wozniak\n");
				answer(i);
				break;
			case 4:System.out.println("1=Lionel Messi\t2=Cristiano Ronaldo\n3=Zinedane Zidane\t4=Ronaldinho Gaucho\n");
				answer(i);
				break;
			case 5:System.out.println("1=One World Trade Center\t2=Burj Khalifa\n3=Shanghai Tower\t4=Petronas Twin Towers\n");
				answer(i);
				break;
			case 6:System.out.println("1=USA\t2=Russia\n3=India\t4=China\n");
				answer(i);
				break;
			case 7:System.out.println("1=Sundararajan Pichai\t2=Azim Premji\n3=Satya Nadella\t4=Bobby Jindal\n");
				answer(i);
				break;
			case 8:System.out.println("1=Vivian Richards\t2=Sachin Tendulkar\n3=Brian Lara\t4=Don Bradman\n");
				answer(i);
				break;
			case 9:System.out.println("1=Lee Hsien Loong\t2=Kim Jong Un\n3=Xi Jinping\t4=Shinzo Abe\n");
				answer(i);
				break;
			case 10:System.out.println("1=Steve Jobs\t2=Guido van Rossum\n3=Dennis Ritchie\t4=Bjarne Stroustrup\n");
				answer(i);
				break;
		}
	}
        public void answer(int i)
	{
		Scanner sc=new Scanner(System.in);
		switch(i)
		{
			case 0: rans=1;
					break;
			case 1: rans=3;
					break;
			case 2: rans=4;
					break;
			case 3: rans=4;
					break;
			case 4: rans=1;
					break;
			case 5: rans=2;
					break;
			case 6: rans=2;
					break;
			case 7: rans=1;
					break;
			case 8: rans=4;
					break;
			case 9: rans=3;
					break;
			case 10: rans=3;
					break;
		}
		System.out.println("\nWould you like to 1.)Continue or 2.)Use Lifeline?");
		int opt=sc.nextInt();
		if(opt==2)
		{
			int p=lifeline_menu(i);
                        if(flag5==1)
                        {
                            	question(p);
                        }
                        else if(f==1)
                        {
				f=0;
			 	question(10);
			}
                        else
                        {
                            	answer(p);
                            	l--;
                        }
		}
		else if(opt==1)
		{
			System.out.println("\nEnter your choice.");
			int ans=sc.nextInt();
			if(ans==rans)
			money();
			else if(ans>=1&&ans<=4&&ans!=rans)
			wrongans();
			else
			{
				System.out.println("Invalid input. Please select again");
				answer(i);
			}	
		}
		else
		{
			System.out.println("Invalid input. Please select again.");
			answer(i);
		}
	}	

	public void money()
	{
		Scanner sc=new Scanner(System.in);
		money+=10;
		if(money<100)
		{
		System.out.println("\n\nYour answer is correct.\nCongratulations. Your total earnings are: "+money+" lacs\n\n");
		question(i);
		}
		else if(money==100)
		{
			System.out.println("\n\nCongratulations. You  have won the game. Total earnings: 1 crore.\nThank You for playing.");
			System.exit(0);
		}
	}
	public void wrongans()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Sorry. You gave the wrong answer. Correct answer is:\t"+rans);
		System.out.println("Your total earnings are:\t"+money+" lacs");
		System.out.println("Thank You for playing. Press 1 to play again, press 0 to exit.");
		ex=sc.nextInt();
	}
}