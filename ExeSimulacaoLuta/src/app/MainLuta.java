package app;

public class MainLuta {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Peter", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("João", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Brad", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Anthony", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Chico", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Isaac", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        Luta confronto1 = new Luta();
        confronto1.marcarLuta(l[4], l[5]);
        confronto1.lutar();




    }
}
