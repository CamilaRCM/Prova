package Questão2;

public class Pix extends Pagamento{

    private boolean comprovanteTransacaoPix() {
        if (this.dataHoraPagamento() == null) {
            return false;
        } else {
            return true;
        }
    }
    }