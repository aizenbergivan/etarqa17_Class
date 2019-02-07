import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static jdk.nashorn.internal.objects.NativeJava.type;

public class TeamHelper extends HelperBase{
  private WebDriver wd;

  public TeamHelper(WebDriver wd) {
    super(wd);
  }


  public void clickOnCreateTeamButtonOnNavMenu() {
    click(By.cssSelector("[data-test-id='home-navigation-create-team-button']"));
  }

  public void fillTeamCreationForm(String teamName, String description) {
    type(By.id("org-display-name"), teamName);
    type(By.id("org-desc"), description);
  }

  public void submitTeamCreationForm() {
    click(By.xpath("//*[@value='Create']"));
  }
}
