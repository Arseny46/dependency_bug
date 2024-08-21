package tests;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class BugReproduction {
  
  
  @Test
  public void reproduction(){
    open("https://ru.wikipedia.org/");
    sleep(500);
    
    
  }
}
