package weapon_game_project;

public class Player {
	public static void main(String[] args) {
		Game g=new Game();
		Weapon w=g.pressButton();
		w.use();
		System.out.println("Program ends!!");
	}

}