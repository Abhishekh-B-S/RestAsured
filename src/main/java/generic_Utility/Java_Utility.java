package generic_Utility;

import java.util.Random;


/**
 * This method is used get random number 
 * @author ABHISHEK
 *
 */

public class Java_Utility {
	public int getRandomNumber()
	{
		Random ran=new Random();
		int random=ran.nextInt(10000);
		return random;
	}
	

}
