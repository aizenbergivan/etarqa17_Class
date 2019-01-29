import org.testng.annotations.Test;

public class LoginTest extends  TestBase {

  @Test
          public  void testLogIn(){
    clickOnLoginButton();
    fillLoginForm();
    confirmLogin();
  }


}
