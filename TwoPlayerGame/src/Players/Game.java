package Players;

public class Game {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the player1 ========================================================
		Player1 player= new Player1("amit","sword",200);
		System.out.println(player.getName());
		System.out.println(player.getWeapon());
		System.out.println(player.getHealth());
		player.damageByGun1();
		player.damageByGun1();
		player.heal();
		player.damageByGun1();
		player.damageByGun1();
		player.heal();
		
		//creating player2 ===============================================
		Player2 betterplayer=new Player2("Ajex","AK47",100,true);
		System.out.println(betterplayer.getName());
		System.out.println(betterplayer.getHealth());
		System.out.println(betterplayer.getWeapon());
		
	}

}
