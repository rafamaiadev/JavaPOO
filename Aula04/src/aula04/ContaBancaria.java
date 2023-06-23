package aula04;

public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean ativado;

    public ContaBancaria() {
        setSaldo(0);
        setAtivado(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isAtivado() {
        return ativado;
    }

    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    }
    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Ativado: " + this.isAtivado());
        System.out.println("---------------------------");
    }
    public void abrirConta(String tipoConta) {
        this.setTipo(tipoConta);
        this.setAtivado(true);
        if (this.getTipo() == "cc") {
            this.setSaldo(50);
        } else if (getTipo() == "cp"){
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setAtivado(false);
        } else {
            System.out.println("Para encerrar conta, seu saldo deve ser 0");
        }
    }

    public void depositar(float deposito) {
        if (this.isAtivado()) {
            this.setSaldo(this.getSaldo()+deposito);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar");
        }
    }
    public void sacar(float saque) {
        if (isAtivado() && getSaldo() >= saque) {
            this.setSaldo(this.getSaldo()-saque);
            System.out.println("Saque realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível sacar, saldo insuficiente");
        }
    }
    public void pagarMensal() {
        if (this.getTipo() == "cc") {
            this.setSaldo(getSaldo()-12);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else if (this.getTipo() == "cp") {
            this.setSaldo(getSaldo()-20);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        }
    }
}
