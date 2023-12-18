import javax.swing.*;


public class Teams {
    public String name, coach;
    public int matchPlayed, matchWin, matchDraw, matchLoss;
    public int goalsFavor, goalsAgainst, goalDifference, totalPoints;
    public ImageIcon logo;


    Teams(String tName, String cName, ImageIcon tLogo,
            int mWin, int mDraw, int mLoss,
                int gFavor, int gAgainst){

        //Team Description
        name = tName;
        coach = cName;
        logo = tLogo;

        //Team Stats
        matchPlayed = mWin + mLoss + mDraw;
        matchWin = mWin;
        matchDraw = mDraw;
        matchLoss = mLoss;
        goalsFavor = gFavor;
        goalsAgainst = gAgainst;
        goalDifference = gFavor - gAgainst;
        totalPoints = mWin * 3 + mDraw;



    }


}


