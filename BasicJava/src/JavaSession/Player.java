package JavaSession;

public class Player {
	
	String PlayerName, PlayerCountry;
	
	public Player()
	{
		PlayerCountry = "India";
		
	}
	
	public Player(String PlayerName)
	{
	this();
	this.PlayerName = PlayerName;
	}
	
	public void displayplayer()
	{
		System.out.println(PlayerName+" "+PlayerCountry);
	}
	
	public static void main(String[]args)
	{
		Player P = new Player("Farman");
		P.displayplayer();
		
	}
	
	
	
	
	
}
