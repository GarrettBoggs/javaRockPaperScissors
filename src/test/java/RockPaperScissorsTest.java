import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void runGame_shoulbeBeAString_rockWins() {
    RockPaperScissors testGame = new RockPaperScissors("rock");
    String playerTwoChoice = testGame.runGame("scissors");
    assertEquals("rock wins", playerTwoChoice);
  }

  @Test
  public void runGame_shoulbeBeAString_paperWins() {
    RockPaperScissors testGame = new RockPaperScissors("paper");
    String playerTwoChoice = testGame.runGame("rock");
    assertEquals("paper wins", playerTwoChoice);
  }

  @Test
  public void runGame_shoulbeBeAString_scissorsWins() {
    RockPaperScissors testGame = new RockPaperScissors("scissors");
    String playerTwoChoice = testGame.runGame("paper");
    assertEquals("scissors wins", playerTwoChoice);
  }

  @Test
  public void runGame_shoulbeBeAString_tie() {
    RockPaperScissors testGame = new RockPaperScissors("scissors");
    String playerTwoChoice = testGame.runGame("scissors");
    assertEquals("tie!", playerTwoChoice);
  }

  @Test
  public void runComputer_shoulbeBeAString_true() {
    RockPaperScissors testGame = new RockPaperScissors("scissors");
    String playerTwoChoice = testGame.runComputer();
    assertEquals(true, playerTwoChoice instanceof String);
  }
}
