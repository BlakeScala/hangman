import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class HangmanTest{
  //REMEMBER TO RENAME!!!!!!1!one!
  @Test
  public void getWord_returnRandomWord_String() {
    Hangman tester = new Hangman();
    assertEquals(true, tester.getWord() instanceof String);
  }

  @Test
  public void checkInput_ifcontainsCharacter_true() {
    Hangman tester = new Hangman();
    assertEquals(true, tester.checkInput("y"));
  }

  @Test
  public void checkInput_ifFailContains_false() {
    Hangman tester = new Hangman();
    assertEquals(false, tester.checkInput("z"));
  }

  @Test
  public void getScore_ifReturnsInteger_true() {
    Hangman tester = new Hangman();
    assertEquals(true, tester.getScore() instanceof Integer);
  }

  @Test
  public void checkFail_ifFailsAdd_true() {
    Hangman tester = new Hangman();
    tester.checkInput("z");
    tester.checkInput("q");
    tester.checkInput("n");
    tester.checkInput("j");
    tester.checkInput("l");
    assertEquals(true, tester.checkFail());
  }

  @Test
  public void userWin_ifReturnsInteger_true() {
    Hangman tester = new Hangman();
    tester.checkInput("g");
    tester.checkInput("r");
    tester.checkInput("a");
    tester.checkInput("v");
    tester.checkInput("y");
    assertEquals(true, tester.userWin());
  }
}
