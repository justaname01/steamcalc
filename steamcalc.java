//imports
import java.util.Scanner;
import java.io.Console;

/*In Java, I can put this program into a package for if/when I toss it into an archive.
 *I have chosen to leave it in the default package because there is just this source file.*/

//public classes must always share their names with the file
public class steamcalc
{
  //as the main class, steamcalc must have a main method
	public static void main(String args[])
	{
	  //create and retrieve the I/O objects
		Scanner reader = new Scanner(System.in);
		Console c = System.console();

    //System.console() can return null. Check for this and make sure that c is non-null
		if(c != null)
		{ //as the below while loop is the only statement following the if statement, I can leave out the curly brackets entirely.
	    //I choose not to, however, largely out of habit
	    
	    boolean again = true;
			while(again)  //and again, and again, and again, and again...
			{
				c.printf("Enter your cut and I will give you the final price\n");
				c.printf("==> ");

				double inNum = 0.0;
				String input = reader.nextLine();
				
				if( !input.equals("##") )
				{
  				try
  				{
  					inNum = Double.valueOf(input);
  				}catch(NullPointerException npe)
  				{
  					continue;
  				}
  				double addValve = inNum * 0.05;
  				double addComp = inNum * 0.1;
  				if(addValve < 0.01)
  					addValve = 0.01;
  				
  				if(addComp < 0.01)
  					addComp = 0.01;
  				
  				c.printf("Steam will charge the buyer %1$.2f.\n\n",inNum + addValve + addComp);
  			}else
  			  again = false;
			}
		}
	}
}
