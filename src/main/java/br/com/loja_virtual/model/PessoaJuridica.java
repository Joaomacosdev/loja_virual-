package br.com.loja_virtual.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa {
    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String cnpj;

    @Column(name = "insc_estadual")
    private String inscEstadual;

    @Column(name = "insc_municipal")
    private String inscMunicipal;

    @Column(name = "nome_fantazia")
    private String nomeFantazia;

    @Column(name = "razao_social")
    private String razaoSocial;

    private String categoria;

    public String getCnpj() {
        return cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public String getInscMunicipal() {
        return inscMunicipal;
    }

    public String getNomeFantazia() {
        return nomeFantazia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCategoria() {
        return categoria;
    }
}
