import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Let's play Rock, Paper, Scissors!");
    System.out.println("Type 'two player' to play against a friend!");
    System.out.println("Type 'single player' to play the computer!");
    String gameMode = console.readLine();

    if(gameMode.equals("two player")) {
      System.out.println("Player 1 type 'rock', 'paper', or 'scissors' ");
      String player1Pick = console.readLine();
      RockPaperScissors player1 = new RockPaperScissors(player1Pick);

      System.out.print("\033[H\033[2J");
      System.out.flush();

      System.out.println("Player 2 type 'rock', 'paper', or 'scissors'");
      String player2Pick = console.readLine();
      player1.runGame(player2Pick);

      System.out.println(player1.runGame(player2Pick));
    } else if(gameMode.equals("single player")) {
      System.out.println("Type rock, paper, or scissors!");
      String playerPick = console.readLine();

      RockPaperScissors player = new RockPaperScissors(playerPick);

      System.out.println(player.runGame(player.runComputer()));
    } else {
      System.out.println("ERROR ERROR input right command 011010");
    }


  }
}
