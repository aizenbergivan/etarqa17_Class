//package tests;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class TeamDeletionTest extends TestBase {
//    @BeforeMethod
//    public void ensurePreconditions() {
//        if (!app.getSessionHelper().isUserLoggedIn()) {
//            app.getSessionHelper().login();
//        }
//    }
//    @Test
//    public void testTeamDeleteFromBody() {
//        int before=app.getTeamHelper().PersonalTeamsCount();
//
//        app.getTeamHelper().closeTeam();
////        app.getBoardHelper().clickTheMoreButton();
////        app.getBoardHelper().clickTheCloseButton();
////        app.getBoardHelper().clickTheCloseConfirmButton();
////        app.returnToPreviousPage();
////        int after=app.getBoardHelper().PersonalBoardsCount();
////        Assert.assertEquals(after,before-1);
//
//    }
//
//}
