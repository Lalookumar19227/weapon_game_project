package weapon_game_project;

public class Gun extends Weapon{
	static int no_of_bullets=100;
	
	@Override
	public void use()
	{
		System.out.println("use the Gun");
		System.out.println("Load the Gun");
		System.out.println("Aim at Enemy and fire");
		System.out.println("Bravo! Head Shot...U killed 'em");
	}
	

}
