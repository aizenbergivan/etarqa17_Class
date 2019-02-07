package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
@BeforeMethod
public void ensurePreconditions() {
  if (app.getSessionHelper().isUserLoggedIn()) {
    app.getSessionHelper().logout();
  }
}
  @Test
  public void testLogIn() {
    app.getSessionHelper().clickOnLoginButton();
    app.getSessionHelper().fillLoginForm("elena.telran@yahoo.com", "12345.com");
    app.getSessionHelper().confirmLogin();
    }


}
