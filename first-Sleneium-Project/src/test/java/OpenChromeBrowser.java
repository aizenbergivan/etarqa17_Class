import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenChromeBrowser {
  WebDriver wd;

  @BeforeClass
  public void setUp(){
    wd= new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }

  @Test
  public void chromeBrowserTest(){
    openSite();
    typeInSearchBar("selenium");


  }

  @Test
  public void chromeBrowserTest2(){
    openSite();
    typeInSearchBar("java");


  }

  public void openSite() {
    wd.get("http://google.com");
  }

  public void typeInSearchBar(String text) {
    wd.findElement(By.name("q")).click();
    wd.findElement(By.name("q")).clear();
    wd.findElement(By.name("q")).sendKeys(text);
  }

  @AfterClass
  public void tearDown() throws InterruptedException {
    //Thread.sleep(3000);
  //  wd.quit();
  }
}
