package Questão2;

public class CartaoCredito extends Pagamento{

    private String numCartao;
    private String bandeiraCartao;
    private String titularCartao;

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    public CartaoCredito(String dataHoraPagamento, int numpagamento, double valorPago, String numCartao, String bandeiraCartao, String titularCartao) {
        super(dataHoraPagamento, numpagamento, valorPago);
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularCartao = titularCartao;

    }
    @Override
    public String impirmirCupomFiscal() {
        return impirmirCupomFiscal;
}
