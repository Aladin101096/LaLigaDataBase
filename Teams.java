import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class Teams {
    public String name, coach;
    public int matchPlayed, matchWin, matchDraw, matchLoss;
    public int goalsFavor, goalsAgainst, goalDifference, totalPoints;
    public String[] teamPlayer;
    public ImageIcon logo;


    Teams(String tName, String cName, ImageIcon tLogo,
            int mWin, int mDraw, int mLoss,
                int gFavor, int gAgainst, String[] newPlayers){

        //Team Description
        name = tName;
        coach = cName;
        logo = scaleImage(tLogo);

        //Team Stats
        matchPlayed = mWin + mLoss + mDraw;
        matchWin = mWin;
        matchDraw = mDraw;
        matchLoss = mLoss;
        goalsFavor = gFavor;
        goalsAgainst = gAgainst;
        goalDifference = gFavor - gAgainst;
        totalPoints = mWin * 3 + mDraw;

        teamPlayer = newPlayers;

    }


    public ImageIcon scaleImage(ImageIcon logo){

        Image img = logo.getImage();
        int width = 200, height = 200;
        Image scaledImage = resizeImage(img, width, height);
        return new ImageIcon(scaledImage);

    }

    public static Image resizeImage(Image originalImage, int wid, int hei){

        BufferedImage scaledImage = new BufferedImage(wid,hei,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = scaledImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(originalImage, 0, 0, wid, hei, null);
        g2.dispose();
        return scaledImage;

    }

    //Sets the description and the statistic section on the Panels.
    public void setStats(JPanel statColumn, JPanel descripColumn){

        JPanel firstColumn = new JPanel();
        BoxLayout statLayout = new BoxLayout(firstColumn, BoxLayout.Y_AXIS);
        firstColumn.setLayout(statLayout);
        firstColumn.add(new JLabel("    Match Played: " + matchPlayed));
        firstColumn.add(new JLabel("    Wins: " + matchWin));
        firstColumn.add(new JLabel("    Draws: " + matchDraw));
        firstColumn.add(new JLabel("    Loss: " + matchLoss));
        firstColumn.add(new JLabel("    Goals Favor: " + goalsFavor));
        firstColumn.add(new JLabel("    Goals Against: " + goalsAgainst));
        firstColumn.add(new JLabel("    Goals Difference " + goalDifference));
        firstColumn.add(new JLabel("    Total Points: " + totalPoints));
        statColumn.add(firstColumn);

        descripColumn.add(new JLabel(logo));
        descripColumn.add(new JLabel("Team Name: " + name));
        descripColumn.add(new JLabel("Team Coach: " + coach));

        JPanel secondColumn = new JPanel();
        BoxLayout stat2Layout = new BoxLayout(secondColumn, BoxLayout.Y_AXIS);
        secondColumn.setLayout(stat2Layout);
        for (int i = 0; i < teamPlayer.length; i++)
            secondColumn.add(new JLabel((i + 1) + ". " + teamPlayer[i]));

        statColumn.add(secondColumn);

    }

    public int getTotalPoints(){
        return totalPoints;
    }





}


