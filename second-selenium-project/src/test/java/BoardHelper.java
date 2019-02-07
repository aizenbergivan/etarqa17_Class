import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoardHelper extends  HelperBase {

  public BoardHelper(WebDriver wd) {
    super(wd);

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

  public void selectCreateBoard() {
    click(By.cssSelector(".js-new-board"));
  }
}
