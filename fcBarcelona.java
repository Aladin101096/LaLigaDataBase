import javax.swing.*;

public class fcBarcelona extends Teams {

    public static final String[] addPlayers = {"Marc-André ter Stegen", "Iñaki Peña", "Ronald Araújo",
                                                "Jules Koundé", "Andreas Christensen", "Iñigo Martínez",
                                                "Alejandro Balde", "Marcos Alonso", "João Cancelo",
                                                "Sergi Roberto", "Oriol Romeu", "Pedri", "Gavi",
                                                "Frenkie de Jong", "İlkay Gündoğan", "Fermín López",
                                                "João Félix", "Raphinha", "Lamine Yamal", "Ferran Torres",
                                                "Robert Lewandowski"};

    public fcBarcelona() {
        super("FC Barcelona",
                "Xavi Hernandez",
                new ImageIcon("FCBarcelona.png"),
                11, 5, 2, 34, 21, addPlayers);


    }
}
