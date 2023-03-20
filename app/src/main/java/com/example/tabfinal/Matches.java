package com.example.tabfinal;

public class Matches {
    String name;
    String opponent_name;
    int teamImage;
    int opponentTeamImage;
    String score;
    String opponentScore;

    public Matches(String name, String opponent_name, int teamImage, int opponentTeamImage, String score, String opponentScore) {
        this.name = name;
        this.opponent_name = opponent_name;
        this.teamImage = teamImage;
        this.opponentTeamImage = opponentTeamImage;
        this.score = score;
        this.opponentScore = opponentScore;
    }
}
