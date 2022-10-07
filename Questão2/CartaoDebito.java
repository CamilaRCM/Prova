package Questão2;

public class CartaoDebito extends Pagamento{

    private String numCartao;
    private String titularCartao;

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    public CartaoDebito(String dataHoraPagamento, int numpagamento, double valorPago, String numCartao, String titularCartao) {
        super(dataHoraPagamento, numpagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;

    }
}
