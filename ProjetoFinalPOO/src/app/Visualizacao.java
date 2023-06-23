package app;

public class Visualizacao {
    private Telespectador espec;
    private Video filme;

    public Visualizacao(Telespectador espec, Video filme) {
        this.espec = espec;
        this.filme = filme;
        this.filme.setViews(filme.getViews() + 1);
        this.espec.setTotAssistido(this.espec.getTotAssistido() + 1);
    }

    public Telespectador getEspec() {
        return espec;
    }

    public void setEspec(Telespectador espec) {
        this.espec = espec;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espec=" + espec +
                ", filme=" + filme +
                '}';
    }

    public void avaliar(float porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        }   else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);


    }
}
