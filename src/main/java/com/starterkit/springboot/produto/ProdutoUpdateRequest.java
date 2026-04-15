package com.starterkit.springboot.produto;

public class ProdutoUpdateRequest {

    private String nome;
    private String fornecedor;
    private String categoria;
    private Integer quantidadeStock;
    private Double preco;
    private Boolean emPromocao;
    private Integer percentagemPromocao;

    // getters e setters

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getFornecedor() { return fornecedor; }
    public void setFornecedor(String fornecedor) { this.fornecedor = fornecedor; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public Integer getQuantidadeStock() { return quantidadeStock; }
    public void setQuantidadeStock(Integer quantidadeStock) { this.quantidadeStock = quantidadeStock; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public Boolean getEmPromocao() { return emPromocao; }
    public void setEmPromocao(Boolean emPromocao) { this.emPromocao = emPromocao; }

    public Integer getPercentagemPromocao() { return percentagemPromocao; }
    public void setPercentagemPromocao(Integer percentagemPromocao) { this.percentagemPromocao = percentagemPromocao; }
}