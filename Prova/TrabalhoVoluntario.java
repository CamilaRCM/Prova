package Prova;

public class TrabalhoVoluntario extends Projeto{
    private  String tipoTrabalho;
    private int duraçãoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descrcao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int duraçãoTrabalho) {
        super(nomeProjeto, descrcao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duraçãoTrabalho = duraçãoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuraçãoTrabalho() {
        return duraçãoTrabalho;
    }

    public void setDuraçãoTrabalho(int duraçãoTrabalho) {
        this.duraçãoTrabalho = duraçãoTrabalho;
    }

    public boolean validaProjeto() {
        if (this.getDuraçãoTrabalho() > 2) {
            return true;
        } else {
            return false;
        }

        String imprimeProjeto;
        {
            return String("Nome do projeto:"getNomeProjeto() + "\nDescrição: " + getDescrcao() + "\nDataInicio: " + getDataInicio() + "\nDataFim: " + getDataFim() + "\nTipo trabalho:" + getTipoTrabalho() + "\nDuraçao" + getDuraçãoTrabalho());


        }
    }