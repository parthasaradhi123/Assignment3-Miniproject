import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner sc = new Scanner(System.in);
	
		l1:while(true)
		{
			System.out.println("Guesser please kindly guess the number : ");
			guessNum = sc.nextInt();
			
			if(guessNum >=1 && guessNum<=10)
			{
				break l1;
			}
			else 
			{
				System.out.println("Please enter the value with in the range of 0 to 10, Thank You.");
			}	 
		}
		return guessNum;
		 
	}
	
}
class Player
{
	int guessNum;

    int guessNum()
    {
    	Scanner sc = new Scanner(System.in);
    	
    	l1:while(true)
    	{
    		System.out.println("Hey Player enter your guessed value : ");
    		guessNum = sc.nextInt();
    		
    		if(guessNum >=1 && guessNum<=10)
    		{
    			break l1;
    		}
    		else
    		{
    			System.out.println("Hey Player please enter the value between 0 to 10 ");
    		}
    	}
    	return guessNum;
    }
	
}

class Umpire
{
	int x;
	int y;
	int z;
	int u;
	void getGuesser()
	{
		Guesser g = new Guesser();
	       x= g.guessNum();
		
	}
	void getPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		 y = p1.guessNum();
	
		 z = p2.guessNum();
		
		 u = p3.guessNum();
		
	}
	void compare()
	{
	 
		if(x == y)
		{
			if(x == z && x == u)
			{
				System.out.println("All three player won the match");
			}
			else if( x == z)
			{
				System.out.println("player 1 and 2 won the match ");
			}	
			else if( x == u)
		    {
				System.out.println("Player 1 and 3 won the match");
			}
			else
			{
				System.out.println("Player 1 won the match");
			}
			 
		}
		else if(x == z)			
		{
			if(x == u)
			{
				System.out.println("player 2 nd 3 won the match");
			}
			else
			{
				System.out.println("player 2 won the match");
			} 
		}
		else if(x ==  u)
		{
			System.out.println("player 3 won the match");
		}
		else 
		{
			System.out.println("No one won the game");
		}
	}
}



public class Project {

	public static void main(String[] args)
	{
	   Umpire u = new Umpire();
	   u.getGuesser();
	   u.getPlayer();
	   u.compare();
	   
	   

	}

}
