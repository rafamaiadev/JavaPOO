package app;

public class Mamifero extends Animal {
    private String corPelo;
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Leite");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
}
