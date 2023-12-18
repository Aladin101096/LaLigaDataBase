import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Objects;


public class Layout implements ActionListener{

    public JFrame mainFrame = new JFrame();
    public JTextField searchField = new JTextField(20);
    public JButton searchButton = new JButton("Search");
    public JPanel descripSection = new JPanel();
    public JPanel searchSection = new JPanel();
    public JPanel statSection = new JPanel();
    public JLabel imgSearch = new JLabel();
    public JLabel teamName = new JLabel();
    public JLabel coachName = new JLabel();
    public JLabel statistics = new JLabel();





    //Set GUI
    public Layout(){
        JPanel mainMenu = new JPanel();
        mainMenu.setLayout(new BorderLayout());
        mainMenu.setSize(1000,500);


        //Layout of the Search Bar
        searchSection.setLayout(new FlowLayout());
        searchSection.add(searchField);
        searchSection.add(searchButton);
        mainMenu.add(searchSection, BorderLayout.NORTH);


        //Layout of the Team Description
        BoxLayout boxDesLayout = new BoxLayout(descripSection, BoxLayout.Y_AXIS);
        descripSection.setLayout(boxDesLayout);
        descripSection.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,20));
        mainMenu.add(descripSection, BorderLayout.WEST);
        imgSearch.setSize(100,100);
        descripSection.add(imgSearch);
        descripSection.add(teamName);
        descripSection.add(coachName);

        //Layout the Team Stats
        BoxLayout boxStaLayout = new BoxLayout(statSection, BoxLayout.Y_AXIS);
        statSection.setLayout(boxStaLayout);
        mainMenu.add(statSection, BorderLayout.CENTER);
        statSection.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,20));
        statSection.add(statistics);

        searchButton.addActionListener(this);

        mainFrame.pack();
        mainFrame.setSize(1500,1000);
        mainFrame.setVisible(true);
        mainFrame.getContentPane();
        mainFrame.add(mainMenu);


    }

    public void actionPerformed(ActionEvent event){

        /*
        When the search button is clicked, it will compare what's inside the search field
        and prints depending what is on it.
        */
        String command = event.getActionCommand();
        if(command.equals("Search")) {
                statSection.removeAll();
                if(Objects.equals(searchField.getText(), "Real Madrid")) {
                    Teams madrid = new realMadrid();
                    setDescripSection(madrid.logo, madrid.name, madrid.coach);
                    setStat(madrid.matchPlayed, madrid.matchWin, madrid.matchDraw, madrid.matchLoss,
                            madrid.goalsFavor, madrid.goalsAgainst, madrid.goalDifference, madrid.totalPoints);
                } else if (Objects.equals(searchField.getText(), "FC Barcelona")) {
                    Teams barcelona = new fcBarcelona();
                    setDescripSection(barcelona.logo, barcelona.name, barcelona.coach);
                    setStat(barcelona.matchPlayed, barcelona.matchWin, barcelona.matchDraw, barcelona.matchLoss,
                            barcelona.goalsFavor, barcelona.goalsAgainst, barcelona.goalDifference, barcelona.totalPoints);
                }

        }
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

    public void setDescripSection(ImageIcon teamLogo, String tName, String cName){
        imgSearch.setIcon(scaleImage(teamLogo));
        teamName.setText(tName);
        coachName.setText(cName);
    }

    public void setStat(int mp, int wI, int dR, int lO, int gF, int gA, int gD, int tP){
        statSection.add(new JLabel("Match Played: " + String.valueOf(mp)));
        statSection.add(new JLabel("Win: " + String.valueOf(wI)));
        statSection.add(new JLabel("Draw: " + String.valueOf(dR)));
        statSection.add(new JLabel("Loss: " + String.valueOf(lO)));
        statSection.add(new JLabel("Goals Favor: " + String.valueOf(gF)));
        statSection.add(new JLabel("Goals Against: " + String.valueOf(gA)));
        statSection.add(new JLabel("Goals Difference: " + String.valueOf(gD)));
        statSection.add(new JLabel("Total Points: " + String.valueOf(tP)));

    }

}
