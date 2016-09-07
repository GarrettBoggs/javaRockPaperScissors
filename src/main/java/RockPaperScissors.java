class RockPaperScissors{

  String mChoice;

  public RockPaperScissors(String ch) {
    mChoice = ch;
  }

  public String runGame(String otherPick) {
    if(mChoice.equals("rock") && otherPick.equals("scissors") || mChoice.equals("scissors") && otherPick.equals("rock"))
    {
      return "rock wins";
    } else if(mChoice.equals("paper") && otherPick.equals("rock") || mChoice.equals("rock") && otherPick.equals("paper"))
    {
      return "paper wins";
    } else if(mChoice.equals("scissors") && otherPick.equals("paper") || mChoice.equals("paper") && otherPick.equals("scissors"))
    {
      return "scissors wins";
    } else
    {
    return "tie!";
    }
  }

  public String runComputer() {
     double pick = Math.random()*3;

    if(pick < 1)
      return "rock";
    else if(pick < 2)
      return "paper";
    else
      return "scissors";

  }
}
