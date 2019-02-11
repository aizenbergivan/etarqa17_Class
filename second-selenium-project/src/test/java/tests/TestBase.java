package tests;

import manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

  protected static ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

  @BeforeSuite
  public void setUp() {
    app.start();
  }

  @AfterSuite
  public void tearDown() {
    app.stop();
  }

}
