import java.util.Scanner;

class Main {
  public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Option test1 = new Option(false, 3);
		
		System.out.println(test1.toString());
		System.out.println("Do you want to change anything? Enter a number.\n");
    
		System.out.println("1. Yes\n2. No\n3. What\n");
		int user = input.nextInt();
		checkAnswer(user, input);
		System.out.println("\nit works, neat.");
  }
	public static void checkAnswer(int num, Scanner input)
	{
		while(num > 3)
		{
			System.out.println("\nInvalid entry, enter a number between 1 and 3.\n1. Yes\n2. No\n3.What\n");
			num = input.nextInt();
		}
	}
}