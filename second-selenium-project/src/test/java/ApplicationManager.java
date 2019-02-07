import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  BoardHelper boardHelper;
  TeamHelper teamHelper;
  WebDriver wd;

  public void start() {
    wd= new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    wd.manage().window().maximize();
    openSite("https://trello.com");
    boardHelper = new BoardHelper(wd);
    teamHelper = new TeamHelper(wd);
  }

  public void stop() {
    wd.quit();
  }

  protected void clickOnLoginButton() {
    boardHelper.click(By.className("header-button-secondary"));
  }

  protected void confirmLogin() {
    boardHelper.click(By.cssSelector("#login"));
  }

  protected void fillLoginForm(String user, String password) {
    boardHelper.type(By.cssSelector("input[type=email]"), user);

    boardHelper.type(By.cssSelector("input[type=password]"), password);
  }

  public void openSite(String url) {
    wd.get(url);
  }

  public  void login(){
    clickOnLoginButton();
    fillLoginForm("elena.telran@yahoo.com", "12345.com");
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
    boardHelper.click(By.xpath("//span[@class='member']"));
  }

  protected void clickOnLogOutButton() {
    boardHelper.click(By.cssSelector("a.js-logout"));
  }



  public void logout() {
    clickOnAvatar();
   clickOnLogOutButton();

  }

  public void returnToPreviousPage() {
    wd.navigate().back();
  }

  public void clickOnPlusButtonOnHeader() {
    boardHelper.click(By.cssSelector("div.header-user .icon-add"));
  }

  public BoardHelper getBoardHelper() {
    return boardHelper;
  }

  public TeamHelper getTeamHelper() {
    return teamHelper;
  }
}
