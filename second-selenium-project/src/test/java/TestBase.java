import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
  WebDriver wd;

  @BeforeClass
  public void setUp(){
    wd= new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    wd.manage().window().maximize();
    openSite("https://trello.com");

  }

  @AfterClass
  public void tearDown() {
   wd.quit();
  }

  protected void clickOnLoginButton() {
    wd.findElement(By.className("header-button-secondary")).click();
  }

  protected void confirmLogin() {
    wd.findElement(By.cssSelector("#login")).click();

  }

  protected void fillLoginForm() {
    wd.findElement(By.cssSelector("input[type=email]")).click();
    wd.findElement(By.cssSelector("input[type=email]")).clear();
    wd.findElement(By.cssSelector("input[type=email]")).sendKeys("elena.telran@yahoo.com");



    wd.findElement(By.cssSelector("input[type=password]")).click();
    wd.findElement(By.cssSelector("input[type=password]")).clear();
    wd.findElement(By.cssSelector("input[type=password]")).sendKeys("12345.com");
  }

  public void openSite(String url) {
    wd.get(url);
  }

  public  void login(){
    clickOnLoginButton();
    fillLoginForm();
    confirmLogin();
  }

  public boolean isUserLoggedIn() {
    return isElementPresent(By.cssSelector("img.member-avatar"));

  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  protected void clickOnAvatar() {
    click(By.cssSelector("img.member-avatar"));
  }

  private void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void clickOnLogOutButton() {
    click(By.cssSelector("a.js-logout"));
  }
}
