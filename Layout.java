import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;


public class Layout implements ActionListener{

    public JFrame mainFrame = new JFrame();
    public JPanel searchSection = new JPanel();
    public JTextField searchField = new JTextField(20);
    public JButton search = new JButton("Search");
    public JPanel descriptionSection = new JPanel();
    public JPanel statSection = new JPanel();
    public JPanel tableSection = new JPanel();



    //Set GUI
    public Layout(){

        JPanel mainMenu = new JPanel();
        mainMenu.setLayout(new BorderLayout());
        mainMenu.setSize(1000,500);

        //Layout of the Search Bar
        searchSection.setLayout(new FlowLayout());
        searchSection.add(searchField);
        searchSection.add(search);
        mainMenu.add(searchSection, BorderLayout.NORTH);

        //Layout of the Team Description
        descriptionSection.setLayout(new BoxLayout(descriptionSection, BoxLayout.Y_AXIS));
        descriptionSection.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,10));
        mainMenu.add(descriptionSection, BorderLayout.WEST);

        //Layout the Team Stats
        statSection.setLayout(new BoxLayout(statSection, BoxLayout.X_AXIS));
        statSection.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,10));
        mainMenu.add(statSection, BorderLayout.CENTER);

        //Layout the Table
        tableSection.setLayout(new BoxLayout(tableSection, BoxLayout.Y_AXIS));
        tableSection.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,10));
        mainMenu.add(tableSection, BorderLayout.EAST);
        setTableSection();

        search.addActionListener(this);

        mainFrame.pack();
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setVisible(true);
        mainFrame.getContentPane();
        mainFrame.add(mainMenu);


    }

    public void actionPerformed(ActionEvent event) {

        /*
        When the search button is clicked, it will compare what's inside the search field
        and prints depending what is on it.
        */

            statSection.removeAll();
            descriptionSection.removeAll();

            for(int i = 0; i < new statisticsCalculator().table.length; i++){

                if(Objects.equals(new statisticsCalculator().table[i].name, searchField.getText()))
                    new statisticsCalculator().table[i].setStats(statSection, descriptionSection);

            }

            statSection.updateUI();
            descriptionSection.updateUI();

    }


    public void setTableSection(){

        statisticsCalculator theTable = new statisticsCalculator();
        for(int i = 0; i < theTable.table.length; i++)
            tableSection.add(new JLabel((i + 1) + ". " + theTable.table[i].name + "--"
                                        + theTable.table[i].totalPoints));


    }


}
