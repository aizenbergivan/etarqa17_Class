import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenChromeBrowser {
  WebDriver wd;

  @BeforeClass
  public void setUp(){
    wd= new ChromeDriver();
  }

  @Test
  public void chromeBrowserTest(){
    wd.get("http:/google.com");
  }

  @AfterClass
  public void tearDown() throws InterruptedException {
    Thread.sleep(3000);
    wd.quit();
  }
}
