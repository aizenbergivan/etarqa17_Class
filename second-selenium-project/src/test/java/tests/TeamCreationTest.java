package tests;

import model.Team;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TeamCreationTest extends TestBase {
  @BeforeMethod
  public void ensurePreconditions() {
    if (!app.getSessionHelper().isUserLoggedIn()) {
      app.getSessionHelper().login();
    }
  }

  @Test
  public  void teamCreationFromLeftNavMenu(){
    app.getTeamHelper().clickOnCreateTeamButtonOnNavMenu();
    app.getTeamHelper().fillTeamCreationForm(new Team()
            .withTeamName("new Team Lena "+ TimeUnit.SECONDS)
            .withDescription("hjhjkhkhkj"));
    app.getTeamHelper().submitTeamCreationForm();
  }


}
