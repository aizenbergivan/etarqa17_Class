//package manager;
//
//import model.Team;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class TeamHelper extends HelperBase{
//  private WebDriver wd;
//
//  public TeamHelper(WebDriver wd) {
//    super(wd);
//  }
//
//
//  public void clickOnCreateTeamButtonOnNavMenu() {
//    click(By.cssSelector("[data-test-id='home-navigation-create-team-button']"));
//  }
//
//  public void fillTeamCreationForm(Team team) {
//    type(By.id("org-display-name"), team.getTeamName());
//    type(By.id("org-desc"), team.getDescription());
//  }
//
//  public void submitTeamCreationForm() {
//    click(By.xpath("//*[@value='Create']"));
//  }
//
//  public int PersonalTeamsCount() {
//    WebElement personalTeams = wd.findElement(By.xpath("//body//div[@class='chrome chrome-71 windows body-webkit-scrollbars body-tabbed-page']//div//div[@class='_3-Xrz8XpMpyaUL']//div//div[@tabindex='-1']//div[@class='member-boards-view']//div[@class='js-boards-page']//div[@class='js-react-root']//div//div[@class='home-container']//div[@class='home-sticky-container']//div//nav[@class='home-left-sidebar-container']//div[2]"));
//    return personalTeams.findElements(By.xpath("//span[contains(text(),'Create a team')]")).size() - 1;
//
//  }
//
//  public void closeTeam() {
//    WebElement personalTeams = wd.findElement(By.xpath("//body//div[@class='chrome chrome-71 windows body-webkit-scrollbars body-tabbed-page']//div//div[@class='_3-Xrz8XpMpyaUL']//div//div[@tabindex='-1']//div[@class='member-boards-view']//div[@class='js-boards-page']//div[@class='js-react-root']//div//div[@class='home-container']//div[@class='home-sticky-container']//div//nav[@class='home-left-sidebar-container']//div[2]"));
//    personalTeams.findElements(By.xpath("//span[contains(text(),'Create a team')]")).click();
//
//  }
//}
