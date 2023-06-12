package modelo;

import java.time.LocalDate;

public class Produto {
    private int codigo;
    private String descricao;
    private String tipo;
    private Sabor sabor;
    private LocalDate dataFabricacao;

    public static Produto cadastrarProduto(Produto produtoRecebido){
        Produto p = new Produto();
        p.setDescricao(produtoRecebido.getDescricao());
        p.setTipo(produtoRecebido.getTipo());
        p.setSabor(produtoRecebido.getSabor());
        p.setDataFabricacao(produtoRecebido.getDataFabricacao());
        return p;
    }

    public Produto(int codigo, String descricao, String tipo, Sabor sabor, LocalDate dataFabricacao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.sabor = sabor;
        this.dataFabricacao = dataFabricacao;
    }

    public Produto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}
