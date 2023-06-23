package app;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }

    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void abrirMenu() {
        System.out.println("------MENU------");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.println("[]");
        }
    }

    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }


    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() + 5);
        }
    }

    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() - 5);
        }
    }

    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }


    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    public void play() {
        if (this.isLigado() && !(isTocando())) {
            this.setTocando(true);
        }

    }

    public void pause() {
        if (this.isLigado() && !(isTocando())) {
            this.setTocando(false);
        }
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
