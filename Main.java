import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) 
	{
		ArrayList<String> option1 = new ArrayList<String>();
		ArrayList<String> option2 = new ArrayList<String>();
		ArrayList<String> option3 = new ArrayList<String>();
		ArrayList<String> story = new ArrayList<String>();
		populate(option1, option2, option3, story);

		Scanner input = new Scanner(System.in);
		Option opt1 = new Opt1(false, 0);
		Option opt2 = new Opt2(false, 0);
		Option opt3 = new Opt3(false, 0);

		System.out.println(story.get(0));
    
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
	}//end checkAnswer
	public static void populate(ArrayList<String> option1,	ArrayList<String> option2,	ArrayList<String> option3,	ArrayList<String> story)
	{
		//option 1
		option1.add("Go back to sleep");
		option1.add("Go back to bed");
		option1.add("Nothing.");
		option1.add("Go back inside.");

		//option 2
		option2.add("Get out of bed and get ready");
		option2.add("Leave the room");
		option2.add("Get out of bed.");
		option2.add("Eggs");
		option2.add("Pull out your phone and call someone you know.");

		//option 3
		option2.add("Stay in bed for another hour.");
		option2.add("Check the time");
		option2.add("Leftovers from yesterday.");
		option2.add("Explore!");

		//story
		story.add("It’s morning and it’s time to wake up. The clock reads 6 o’clock, what do you do?");
		story.add("You went back to sleep and…. Not even 5 minutes later, you’re awake again. What do you do?");
		story.add("You got out of bed and got ready for the day. Now that you’re ready.. What do you do now?");
		story.add("Why did you go back to bed? That’s kind of weird. You went and got ready for the day and now you just.. Go back to bed?? Wack. Well, now that you’re in bed, what do you do?");
		story.add("You left your bedroom and you’re now in the living room. Your stomach growled, you should probably make food. What do you make?");
		story.add("Uh. Ok then. I guess you weren’t that hungry. You left your house but suddenly, it doesn't even look like the city anymore. Where are you? Your house turned into a little shack. What do you do?");
		story.add("You made eggs and walked outside. As you readjusted to the sun, you realized that this isn’t the city anymore. What do you do now?");
		story.add("You decided to explore and you came across a woman who seemed to be waiting for you. Just before you asked where you were, she spoke just before you.\n\nVi: Ehh, sorry. Because the developer has been procrastinating on this project, this isn’t all that well finished. Maybe check back in the summer for some resonance of a story. Thanks for playing, I guess.");
		story.add("You heated up your leftovers from yesterday in the microwave. After you ate, you went outside and readjusted to the sun. Shortly after, you realize you aren’t in the city anymore. What’s the first thing you do?");
		story.add("You decided to stay in bed for another hour. You’re… weird. You just stared at the ceiling for an hour, are you ok? Don’t answer that question. Now that you’ve stared at your ceiling for an hour, what do you do?");
		story.add("You decided to stay in bed for another hour. You’re… weird. You just stared at the ceiling for an hour, are you ok? Don’t answer that question. Now that you’ve stared at your ceiling for an hour, what do you do?");
		story.add("FINE. FINE. You stayed in bed for the rest of the day, doing nothing but just staring at the ceiling. Are you happy? You did absolutely nothing. The game’s over and you did nothing.");
	}//end populate
}