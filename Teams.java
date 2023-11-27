import javax.swing.*;


public class Teams {
    String name, coach;
    Icon logo;
    int matchPlayed, wins, draws, loses;

    Teams(String name, String coach, Icon logo){
        this.name = name;
        this.coach = coach;
        this.logo = logo;
    }

    public Icon getLogo() {
        return logo;
    }

    public int getDraws() {
        return draws;
    }

    public int getLoses() {
        return loses;
    }

    public int getMatchPlayed() {
        return matchPlayed;
    }

    public int getWins() {
        return wins;
    }

    public String getCoach() {
        return coach;
    }

    public String getName() {
        return name;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
}


