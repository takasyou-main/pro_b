public class GamePlayer {
    String playername;
    public GamePlayer(String name) {
	playername = name;
    }
  @Override
  public String toString() {
      return "[player:" + playername + "]";
  }
    public static void main(String[] args) {
	GamePlayer[] player = new GamePlayer[3];
	player[0] = new GamePlayer("Sugiki");
	player[1] = new GamePlayer("Maeda");
	player[2] = new GamePlayer("Kato");
	for (int i = 0; i < player.length; i++) {
	    System.out.println(player[i]);
	}
    }
}
