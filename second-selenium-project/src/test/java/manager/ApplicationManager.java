package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  SessionHelper sessionHelper;
  BoardHelper boardHelper;
  TeamHelper teamHelper;
  WebDriver wd;
  String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public void start() {
    if (browser.equals(BrowserType.CHROME)) {
      wd= new ChromeDriver();
    } else if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    } else if (browser.equals(BrowserType.EDGE)){
      wd = new EdgeDriver();
    } else if (browser.equals(BrowserType.IE)){
      wd = new InternetExplorerDriver();
    }

    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
