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

    app.clickTheCreateNewBoardOnTheEndOfList();

    app.addBoardTitle("newBoard" + System.currentTimeMillis());
    app.clickTheCreateButton();
    app.returnToPreviousPage();
  }

  @Test
  public void testBoardCreationFromHeader() {
    app.clickOnPlusButtonOnHeader();
    app.selectCreateBoard();
    app.addBoardTitle("newBoard" + System.currentTimeMillis());
    app.clickTheCreateButton();
    app.returnToPreviousPage();

  }
}
