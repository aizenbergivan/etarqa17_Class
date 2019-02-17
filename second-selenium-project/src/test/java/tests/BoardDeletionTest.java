package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDeletionTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.getSessionHelper().isUserLoggedIn()) {
            app.getSessionHelper().login();
        }
    }



    @Test
    public void testBoardDeleteFromBody() {
        int before=app.getBoardHelper().PersonalBoardsCount();

        app.getBoardHelper().closeBoard();
        app.getBoardHelper().clickTheMoreButton();
        app.getBoardHelper().clickTheCloseButton();
        app.getBoardHelper().clickTheCloseConfirmButton();
        app.returnToPreviousPage();
        int after=app.getBoardHelper().PersonalBoardsCount();
        Assert.assertEquals(after,before-1);

    }

}
