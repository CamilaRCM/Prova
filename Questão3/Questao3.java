package Questão3;

public class Questao3 {

    private double mensalidade;
    private int numeroIrmaos;

    public void mensalidade(double mensalidade, int numeroIrmaos) {
        this.mensalidade = mensalidade;
        this.numeroIrmaos = numeroIrmaos;
    }

    public double calculaMensalidade() {
        if (this.numeroIrmaos == 1) {
            return this.mensalidade -= (this.mensalidade * 0.05);
        } else if (this.numeroIrmaos == 2) {
            return this.mensalidade -= (this.mensalidade * 0.1);
        } else if (this.numeroIrmaos > 2) {
            return this.mensalidade -= (this.mensalidade * 0.15);
        } else {
            return this.mensalidade;
        }
    }

}

