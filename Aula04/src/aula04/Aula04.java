package aula04;

public class Aula04 {
    public static void main(String[] args) {
        ContaBancaria cliente1 = new ContaBancaria();
        cliente1.setNumConta(1050);
        cliente1.setDono("Raphael");
        cliente1.abrirConta("cp");
        cliente1.depositar(500);

        ContaBancaria cliente2 = new ContaBancaria();
        cliente2.setNumConta(13535);
        cliente2.setDono("Chico");
        cliente2.abrirConta("cc");
        cliente2.depositar(300);
        cliente2.sacar(100);
        cliente2.sacar(400);

        cliente1.estadoAtual();
        cliente2.estadoAtual();

    }
}
