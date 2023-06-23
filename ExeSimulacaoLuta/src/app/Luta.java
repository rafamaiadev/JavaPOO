package app;

import app.Lutador;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        this.setDesafiado(desafiado);
        this.setDesafiante(desafiante);
        if (this.getDesafiado().getCategoria().equals(this.getDesafiante().getCategoria())) {
            if (this.getDesafiado() != this.getDesafiante()) {
                this.setAprovada(true);
                this.setDesafiado(desafiado);
                this.setDesafiante(desafiante);
            }
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }


    public void lutar() {
        if (isAprovada()) {
            this.getDesafiado().apresentar();
            System.out.println("--------------------------");
            this.getDesafiante().apresentar();
            System.out.println("--------------------------");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            if (vencedor == 1) {
                this.getDesafiado().ganharLuta();
                this.getDesafiante().perderLuta();
                System.out.println("O vencedor foi: " + this.getDesafiado().getNome());
                System.out.println("--------------------------");
            } else if (vencedor == 2) {
                this.getDesafiado().perderLuta();
                this.getDesafiante().ganharLuta();

                System.out.println("--------------------------");
            } else {
                this.getDesafiado().empatarLuta();
                this.getDesafiante().empatarLuta();
                System.out.println("A luta empatou!");
                System.out.println("--------------------------");
            }
        } else {
            System.out.println("A luta não foi aprovada");
        }
    }
}

