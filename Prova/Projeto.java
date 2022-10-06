package Prova;

public abstract class Projeto {
    private String nomeProjeto;
    private String descrcao;
    private String endereco;
    private String dataInicio;
    private String dataFim;

    public Projeto(String nomeProjeto, String descrcao, String endereco, String dataInicio, String dataFim) {
        this.nomeProjeto = nomeProjeto;
        this.descrcao = descrcao;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescrcao() {
        return descrcao;
    }

    public void setDescrcao(String descrcao) {
        this.descrcao = descrcao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }






}


