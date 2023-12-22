import javax.swing.*;

public class atleticoMadrid extends Teams{

    public static final String[] addPlayers = {"Jan Oblak", "Ivo Grbic", "José María Giménez",
                                                "Mario Hermoso", "Çağlar Söyüncü", "Stefan Savic",
                                                "Axel Witsel", "Reinildo Mandava", "Javi Galán",
                                                "Nahuel Molina", "César Azpilicueta", "Rodrigo de Paul",
                                                "Marcos Llorente", "Pablo Barrios", "Koke",
                                                "Saúl Ñíguez", "Thomas Lemar", "Samuel Lino",
                                                "Rodrigo Riquelme", "Vitolo", "Ángel Correa",
                                                "Antoine Griezmann", "Álvaro Morata", "Memphis Depay",};

    public atleticoMadrid(){
        super("Atletico Madrid",
                "Diego Simeone",
                new ImageIcon("Atletico Madrid.png"),
                11,2,4,35,19, addPlayers);
    }
}
