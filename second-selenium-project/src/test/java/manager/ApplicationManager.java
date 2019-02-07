package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  SessionHelper sessionHelper;
  BoardHelper boardHelper;
  TeamHelper teamHelper;
  WebDriver wd;

  public void start() {
    wd= new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    wd.manage().window().maximize();
    openSite("https://trello.com");
    sessionHelper = new SessionHelper(wd);
    boardHelper = new BoardHelper(wd);
    teamHelper = new TeamHelper(wd);
  }

  public void stop() {
    wd.quit();
  }

  public void openSite(String url) {
    wd.get(url);
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

  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }
}
