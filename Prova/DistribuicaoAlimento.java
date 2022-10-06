package Prova;

public class DistribuicaoAlimento extends Projeto {

    private String DescAlimento;
    private float Qtd;

    public String getDescAlimento() {
        return DescAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        DescAlimento = descAlimento;
    }

    public float getQtd() {
        return Qtd;
    }

    public void setQtd(float qtd) {
        Qtd = qtd;
    }

    public DistribuicaoAlimento(String nomeProjeto, String descrcao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtd) {
        super(nomeProjeto, descrcao, endereco, dataInicio, dataFim);

        DescAlimento = descAlimento;
        Qtd = qtd;
    }

    public boolean validaProjeto() {
        if (this.getDataFim() == null) {
            return false;
        } else {
            return true;
        }
    }
        public String imprimeProjeto; {
            return String("Nome do projeto:" + getNomeProjeto() + "\nDescrição: " + getDescrcao() + "\nDataInicio: " + getDataInicio() + "\nDataFim: " + getDataFim() + "\nDescriçãoAlimento:" + getDescAlimento() + "\nQtd:"+ getQtd());
        }

}
