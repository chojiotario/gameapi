package br.com.lucasviannasantos.gameapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Player {

    @Id
    private String id;
    private String nome;
    private int maiorPontuacao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaiorPontuacao() {
        return maiorPontuacao;
    }

    public void setMaiorPontuacao(int maiorPontuacao) {
        this.maiorPontuacao = maiorPontuacao;
    }
}
