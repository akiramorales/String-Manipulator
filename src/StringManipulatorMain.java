import java.util.Scanner;
public class StringManipulatorMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean playAgain = true;
		StringManipulator strReturn = new StringManipulator();
		while(playAgain)
		{
		System.out.println("Which method would you like to run?");
		String methodChoice = in.nextLine();
		while(!methodChoice.equals("noVowels") || !methodChoice.equals("reverse"))
		{
			System.out.println("Please input \"noVowels\"  or \"reverse\"");
			methodChoice = in.nextLine();
		}
		if (methodChoice.equals("noVowels"))
		{
		System.out.println("Please input a string");
		String str = in.nextLine();
		String returnString = strReturn.noVowels(str);
		System.out.println(returnString);
		}
		else if(methodChoice.equals("reverse"))
		{
			System.out.println("Please input a string");
			String str = in.nextLine();
			String returnString = strReturn.reverse(str);
			System.out.println(returnString);
		}
		else
		{
			System.out.println("Play again?");
			String answer = in.nextLine();
			if(!answer.equals("yes")||answer.equals("no"))
			{
				System.out.println("Please enter \"yes\" or \"no\"");
				answer = in.nextLine();
			}
			else if (answer.equals("yes"))
			{
				playAgain = true;
			}
			else if (answer.equals("no"))
			{
				playAgain = false;
			}
		}
		}
	}

}
