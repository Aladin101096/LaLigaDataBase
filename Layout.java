import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Layout implements ActionListener{

    JFrame mainFrame = new JFrame();
    JTextField searchField = new JTextField(20);
    JButton searchButton = new JButton("Search");
    JLabel showTeam = new JLabel();





    //Set GUI
    public Layout(){
        JPanel mainMenu = new JPanel();
        mainMenu.setLayout(new GridLayout(2,1));


        mainMenu.add(searchField);
        mainMenu.add(searchButton);
        mainMenu.add(showTeam);
        searchButton.addActionListener(this);

        mainFrame.pack();
        mainFrame.setSize(1000,1000);
        mainFrame.setVisible(true);
        mainFrame.getContentPane();
        mainFrame.add(mainMenu);


    }

    public void actionPerformed(ActionEvent actionEvent){

    }


}
