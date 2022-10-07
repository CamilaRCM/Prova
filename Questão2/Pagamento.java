package Questão2;

public class Pagamento {
    String dataHoraPagamento;
    int numpagamento;
    double valorPago;

    public String getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(String dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public int getNumpagamento() {
        return numpagamento;
    }

    public void setNumpagamento(int numpagamento) {
        this.numpagamento = numpagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public Pagamento(String dataHoraPagamento, int numpagamento, double valorPago) {
        this.dataHoraPagamento = dataHoraPagamento;
        this.numpagamento = numpagamento;
        this.valorPago = valorPago;

    }

    public String impirmirCupomFiscal() {
        return impirmirCupomFiscal;

    }
}
