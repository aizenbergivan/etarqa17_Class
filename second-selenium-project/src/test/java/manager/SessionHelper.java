package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends  HelperBase{
  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  public void clickOnLoginButton() {
    click(By.className("header-button-secondary"));
  }

  public void confirmLogin() {
    click(By.cssSelector("#login"));
  }

  public void fillLoginForm(String user, String password) {
    type(By.cssSelector("input[type=email]"), user);

    type(By.cssSelector("input[type=password]"), password);
  }

  public  void login(){
    clickOnLoginButton();
    fillLoginForm("elena.telran@yahoo.com", "12345.com");
    confirmLogin();
  }

  public boolean isUserLoggedIn() {
    return isElementPresent(By.cssSelector("img.member-avatar"));
  }

  public void clickOnAvatar() {
   click(By.xpath("//span[@class='member']"));
  }

  public void clickOnLogOutButton() {
    click(By.cssSelector("a.js-logout"));
  }

  public void logout() {
    clickOnAvatar();
   clickOnLogOutButton();

  }
}
