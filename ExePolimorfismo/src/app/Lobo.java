package app;

public class Lobo extends Cachorro {
    public void reagir(String frase) {
        if (frase.equals("Olá")) {
            System.out.println("Abanar o rabo e latir");
        } else if (frase.equals("Vai apanhar")) {
            System.out.println("Rosnar");
        }
    }
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Ignorar");
        }
    }
}
