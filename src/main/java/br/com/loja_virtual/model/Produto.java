package br.com.loja_virtual.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity(name = "Produto")
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
    private Long id;

    @Column(name = "tp_unidade")
    private String tpUnidade;

    @Column(columnDefinition = "text", length = 2000)
    private String descricao;

    private Boolean ativo = Boolean.TRUE;

//    private Long notaItemProduto;

    private Double peso;

    private  Double largura;

    private Double altura;

    private Double profundidade;

    private BigDecimal valorVenda = BigDecimal.ZERO;

    private Integer qtdEstoque = 0;

    private Integer qtdAlertaEstoque = 0;

    private String linkYoutube;

    private Boolean alertaQtdEstoque = Boolean.FALSE;

    private Integer qtdClique = 0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getTpUnidade() {
        return tpUnidade;
    }

    public void setTpUnidade(String tpUnidade) {
        this.tpUnidade = tpUnidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Integer getQtdAlertaEstoque() {
        return qtdAlertaEstoque;
    }

    public void setQtdAlertaEstoque(Integer qtdAlertaEstoque) {
        this.qtdAlertaEstoque = qtdAlertaEstoque;
    }

    public String getLinkYoutube() {
        return linkYoutube;
    }

    public void setLinkYoutube(String linkYoutube) {
        this.linkYoutube = linkYoutube;
    }

    public Boolean getAlertaQtdEstoque() {
        return alertaQtdEstoque;
    }

    public void setAlertaQtdEstoque(Boolean alertaQtdEstoque) {
        this.alertaQtdEstoque = alertaQtdEstoque;
    }

    public Integer getQtdClique() {
        return qtdClique;
    }

    public void setQtdClique(Integer qtdClique) {
        this.qtdClique = qtdClique;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Produto produto = (Produto) object;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
