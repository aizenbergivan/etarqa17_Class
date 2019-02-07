package model;

public class Team {
  private  String teamName;
  private  String description;

//  public Team(String teamName, String description) {
//    this.teamName = teamName;
//    this.description = description;
//  }

  public Team withTeamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  public Team withDescription(String description) {
    this.description = description;
    return  this;
  }

  public String getTeamName() {
    return teamName;
  }

  public String getDescription() {
    return description;
  }
}
