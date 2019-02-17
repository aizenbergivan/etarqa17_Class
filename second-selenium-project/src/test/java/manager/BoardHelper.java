package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoardHelper extends  HelperBase {

  public BoardHelper(WebDriver wd) {
    super(wd);

  }
  //efwefwewefwefwewefwe
  public void clickTheCreateNewBoardOnTheEndOfList() {
    WebElement personalBoards = wd.findElement(By.xpath("//*[@class='icon-lg icon-member']/../../.."));
    int boardsCount = personalBoards.findElements(By.xpath(".//*[@class='boards-page-board-section-list-item']")).size();
    personalBoards.findElement(By.xpath(".//*[@class='boards-page-board-section-list-item'][" + (boardsCount) + "]")).click();

  }

  public int PersonalBoardsCount() {
    WebElement personalBoards = wd.findElement(By.xpath("//*[@class='icon-lg icon-member']/../../.."));
    return personalBoards.findElements(By.xpath(".//*[@class='boards-page-board-section-list-item']")).size() - 1;
  }

  public void closeBoard() {
    WebElement personalBoards = wd.findElement(By.xpath("//*[@class='icon-lg icon-member']/../../.."));
    personalBoards.findElement(By.xpath(".//*[@class='boards-page-board-section-list-item']")).click();
  }

//  public int PersonalBoardsCount(){
//    WebElement personalBoards =
//            wd.findElement(By.xpath("//*[@class='icon-lg icon-member']/../../.."));
//    return
//            personalBoards.findElements(By.xpath(".//*[@class='boards-page-board-section-list-item']")).size()-1;
//  }

  public void addBoardTitle(String boardName) {
    type(By.cssSelector("input.subtle-input"), boardName);
  }

  public void clickTheCreateButton() {
    click(By.cssSelector("[type=submit]"));
  }

  public void selectCreateBoard() {
    click(By.cssSelector(".js-new-board"));
  }

  public void clickTheMoreButton() {
    click(By.xpath("//ul[@class='board-menu-navigation']//li[4]"));

  }

  public void clickTheCloseButton() {
    click(By.xpath("//div[@class='board-menu-content-frame']//ul[3]//li[1]"));

  }

  public void clickTheCloseConfirmButton() {
    click(By.xpath("//input[@value='Close']"));
  }

 }