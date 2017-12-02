import java.util.Scanner;
import java.io.Console;

/*In Java, I can put this program into a package for if/when I toss it into an archive.
 *I have chosen to leave it in the default package because there is just this source file.*/

public class steamcalc
{
  	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		Console c = System.console();

    		//System.console() can return null.
		if(c != null)
		{
			//Curly brackets added for readability
	    
			boolean loopAgain = true;
			while(loopAgain)
			{
				c.printf("Please enter what you expect to recieve\n");
				c.printf("==> ");

				double inNum = 0.0;
				String input = reader.nextLine();
				
				if( !input.equals("##") )
				{
  					try
	  				{
	  					inNum = Double.valueOf(input);
	  				}catch(Exception e)
	  				{
	  					c.printf("Sorry, that was not a valid input.\n\n");
	  					continue;
	  				}
	  				double addValve = inNum * 0.05;
	  				double addComp = inNum * 0.1;
	  				if(addValve < 0.01)
	  					addValve = 0.01;
	  				
	  				if(addComp < 0.01)
	  					addComp = 0.01;
	  				
	  				c.printf("For %1$.2f, Steam will charge the buyer %1$.2f.\n\n",inNum + addValve + addComp);
  				}else
  				{
  					//Curly brackets added for readability
  					again = false;
  				}
			}
		}
	}
}
