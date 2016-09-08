import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Hangman{

  private String[] mTotalWords = {"gravy", "pizza", "solidify", "cannabis", "headphone", "computer", "javascript", "dragon", "puppy", "ostrich", "husky"};
  private Integer mLoss = 0;
  Random myRandomGenerator = new Random();
  private String mPlayWord = mTotalWords[myRandomGenerator.nextInt(12)];

  private String mChecker;
  private int mOnce;

  private List<String> currentProgress = new ArrayList<String>();

  public void makeList(){
    for(int i = 0; i < mPlayWord.length() ; i ++)
    {
      currentProgress.add("_ ");
    }
  }

  public String getWord() {
    return mPlayWord;
  }

  public Integer getScore() {
    return mLoss;
  }

  public List<String> getProgress() {
    return currentProgress;
  }

  public boolean userWin(){
    mChecker = "";
    for( String letter : currentProgress){
      mChecker += letter;
    }
    if(mChecker.equals(mPlayWord)){
      return true;
    }
    else{
      return false;
    }
  }

  public boolean checkInput(String userInput) {
    mOnce = 0;
    for(int i = 0; i < mPlayWord.length() ; i ++)
    {
      if(userInput.equals(String.valueOf(mPlayWord.charAt(i)))) {
        currentProgress.set(i, userInput);
        mOnce = 1;
      }
    }

    if(mOnce == 1)
    {
      return true;
    }
    mLoss += 1;
    return false;
  }

  public boolean checkFail() {
    if(mLoss > 4){
      return true;
    } else {
      return false;
    }
  }
}
