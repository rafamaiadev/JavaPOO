package app;

public class Principal {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Reptil r = new Reptil();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Tartaruga t = new Tartaruga();
        Lobo l = new Lobo();
        l.reagir(true);

        m.locomover();
        p.locomover();
        r.locomover();
        a.locomover();
        c.locomover();
        t.locomover();


    }
}
