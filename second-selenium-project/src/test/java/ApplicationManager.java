import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver wd;

  public void start() {
    wd= new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    wd.manage().window().maximize();
    openSite("https://trello.com");
  }

  public void stop() {
    wd.quit();
  }

  protected void clickOnLoginButton() {
    click(By.className("header-button-secondary"));
  }

  protected void confirmLogin() {
    click(By.cssSelector("#login"));
  }

  protected void fillLoginForm() {
    type(By.cssSelector("input[type=email]"), "elena.telran@yahoo.com");

    type(By.cssSelector("input[type=password]"), "12345.com");
  }

  public void type(By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
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
    click(By.xpath("//span[@class='member']"));
  }

  private void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void clickOnLogOutButton() {
    click(By.cssSelector("a.js-logout"));
  }

  public void clickOnCreateTeamButtonOnNavMenu() {
    click(By.cssSelector("[data-test-id='home-navigation-create-team-button']"));
  }

  public void fillTeamCreationForm(String teamName, String description) {
    type(By.id("org-display-name"), teamName);
    type(By.id("org-desc"), description);
  }

  public void submitTeamCreationForm() {
    click(By.xpath("//*[@value='Create']"));
  }

  public void logout() {
    clickOnAvatar();
   clickOnLogOutButton();

  }

  public void clickTheCreateNewBoardOnTheEndOfList() {
    WebElement personalBoards = wd.findElement(By.xpath("//*[@class='icon-lg icon-member']/../../.."));
    int boardsCount = personalBoards.findElements(By.xpath(".//*[@class='boards-page-board-section-list-item']")).size();
   personalBoards.findElement(By.xpath(".//*[@class='boards-page-board-section-list-item']["+(boardsCount)+"]")).click();

  }

  public void addBoardTitle(String boardName) {
    type(By.cssSelector("input.subtle-input"), boardName);
  }

  public void clickTheCreateButton() {
    click(By.cssSelector("[type=submit]"));
  }

  public void returnToPreviousPage() {
    wd.navigate().back();
  }

  public void clickOnPlusButtonOnHeader() {
    click(By.cssSelector("div.header-user .icon-add"));
  }

  public void selectCreateBoard() {
    click(By.cssSelector(".js-new-board"));
  }
}
