import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTest extends TestBase {
  @BeforeMethod
  public void ensurePreconditions() {
    if (!app.isUserLoggedIn()) {
      app.login();
    }
  }

  @Test
  public void testBoardCreationFromBody() {

    app.getBoardHelper().clickTheCreateNewBoardOnTheEndOfList();

    app.getBoardHelper().addBoardTitle("newBoard" + System.currentTimeMillis());
    app.getBoardHelper().clickTheCreateButton();
    app.returnToPreviousPage();
  }

  @Test
  public void testBoardCreationFromHeader() {
    app.clickOnPlusButtonOnHeader();
    app.getBoardHelper().selectCreateBoard();
    app.getBoardHelper().addBoardTitle("newBoard" + System.currentTimeMillis());
    app.getBoardHelper().clickTheCreateButton();
    app.returnToPreviousPage();

  }
}
