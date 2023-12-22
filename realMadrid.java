import javax.swing.*;

public class realMadrid extends Teams{

    public static final String[] addPlayers = {"Thibaut Courtois", "Kepa Arrizabalaga", "Andriy Lunin",
                                                "Éder Militão", "David Alaba", "Antonio Rüdiger",
                                                "Nacho Fernández", "Ferland Mendy", "Fran García",
                                                "Daniel Carvajal", "Lucas Vázquez", "Aurélien Tchouaméni",
                                                "Federico Valverde", "Eduardo Camavinga", "Toni Kroos",
                                                "Dani Ceballos", "Luka Modric", "Jude Bellingham",
                                                "Brahim Díaz", "Arda Güler", "Nico Paz",
                                                "Vinicius Junior", "Rodrygo Rodrygo", "Joselu Joselu"};

    public realMadrid(){
        super("Real Madrid",
                "Carlo Ancelotti",
                new ImageIcon("RealMadrid.png"),
                14,3,1,39,11, addPlayers);

    }
}


