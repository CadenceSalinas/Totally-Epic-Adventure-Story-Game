import java.util.Scanner;

class Main {
  public static void main(String[] args) 
	{
		Option test1 = new Option(false, 3);
		
		System.out.println(test1.toString());
    Scanner input = new Scanner(System.in);
		System.out.println("Can you respond to this? Press any int.");
		input.nextInt();
		System.out.println("Cool! It works.");
  }
}