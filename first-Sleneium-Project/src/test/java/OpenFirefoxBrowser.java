import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenFirefoxBrowser {
  WebDriver wd;

  @BeforeMethod
  public void setUp(){
    wd =new  FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }
  @Test
  public void testeBaySearch(){
    openSite();
    type();
    clickSearcButton();

  }

  @Test
  public void testeBayFilter(){
    openSite();
    type();
    clickSearcButton();
    filterItemsByAuction();
  }

  public void filterItemsByAuction() {
    wd.findElement(By.linkText("Auction")).click();
  }


  public void type() {
    wd.findElement(By.id("gh-ac")).click();
    wd.findElement(By.id("gh-ac")).clear();
    wd.findElement(By.id("gh-ac")).sendKeys("glasses");
  }

  public void clickSearcButton(){
    wd.findElement(By.id("gh-btn")).click();
  }

  public void openSite() {
    wd.get("https://www.ebay.com/");
  }

  @AfterMethod
  public void tearDown(){
 //   wd.quit();
  }
}
