package weapon_game_project;
import java.util.Scanner;
public class Game {
	Game()
	{
		System.out.println("Welcome to Game!");
		System.out.println("Game is Started");
	}
	
	public Weapon pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score:" );
		int score=sc.nextInt();
		if(score<=400)
		{
			System.out.println("You got the Knife!");
			Knife k=new Knife();
			return k;
		}
		else if(score<=800)
		{
			System.out.println("Press 1 for Knife and 2 for Gun!");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("You have selected Knife");
					return new Knife();
				case 2:
					System.out.println("You have selected Gun");
					return new Gun();
				default:
						System.out.println("This is not valid choice!");
						return null;
			}
		}
		else
		{
			System.out.println("You got the Bomb");
			return new Bomb();
		}
		
	}

}
