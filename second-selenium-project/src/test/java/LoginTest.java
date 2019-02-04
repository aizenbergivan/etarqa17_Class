import org.testng.annotations.Test;

public class LoginTest extends TestBase {

  @Test
  public void testLogIn() {
    app.clickOnLoginButton();
    app.fillLoginForm();
    app.confirmLogin();
  }


}
