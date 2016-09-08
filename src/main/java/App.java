import java.io.Console;

public class App {
  public static void main(String[] args) {
    Hangman thisGame = new Hangman();
    Console console = System.console();
    thisGame.makeList();

    System.out.println(thisGame.getProgress());

    while( thisGame.userWin() == false && thisGame.checkFail() == false)  {
      System.out.println("Enter one character");
      String userInput = console.readLine();
      if(thisGame.checkInput(userInput) == true) {
        System.out.println(thisGame.getProgress());
        if(thisGame.userWin())
          System.out.println("Congratz! You just won!");
      }
      else{
        System.out.println("This is wrong!");
        System.out.println("You have guessed wrong " + thisGame.getScore() + " times. You have " + (5 - thisGame.getScore()) + " guesses left.");
        if(thisGame.checkFail())
          System.out.println("Sorry, you lost!");
      }
    }
  }
}
