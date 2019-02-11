package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTest extends TestBase {
  @BeforeMethod
  public void ensurePreconditions() {
    if (!app.getSessionHelper().isUserLoggedIn()) {
      app.getSessionHelper().login();
    }
  }

  @Test
  public void testBoardCreationFromBody() {
    int before = app.getBoardHelper().PersonalBoardsCount();

    app.getBoardHelper().clickTheCreateNewBoardOnTheEndOfList();
    app.getBoardHelper().addBoardTitle("newBoard" + System.currentTimeMillis());
    app.getBoardHelper().clickTheCreateButton();
    app.returnToPreviousPage();

    int after = app.getBoardHelper().PersonalBoardsCount();

    Assert.assertEquals(after, before+1);

  }

  @Test(enabled = false)
  public void testBoardCreationFromHeader() {
    app.clickOnPlusButtonOnHeader();
    app.getBoardHelper().selectCreateBoard();
    app.getBoardHelper().addBoardTitle("newBoard" + System.currentTimeMillis());
    app.getBoardHelper().clickTheCreateButton();
    app.returnToPreviousPage();

  }
}
