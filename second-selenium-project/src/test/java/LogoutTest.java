import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends  TestBase {
  @BeforeMethod
  public  void  ensurePreconditions(){
    if(!isUserLoggedIn()){
      login();
    }
  }
//  public  void  ensurePreconditions(){
//    if(isUserLoggedIn()){
//
//    } else login();
//  }

  @Test
  public void testLogout() throws InterruptedException {
    Thread.sleep(3000);
clickOnAvatar();
clickOnLogOutButton();

    Assert.assertFalse(isUserLoggedIn());
  }

}
