package br.com.lucas.forum.controller.dto;

import br.com.lucas.forum.modelo.Resposta;

import java.time.LocalDateTime;

public class RespostaDTO {

    private Long id;
    private String mensagem;
    private LocalDateTime dataCricacao;
    private String nomeAutor;

    public RespostaDTO(Resposta resposta) {
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.dataCricacao = resposta.getDataCriacao();
        this.nomeAutor = resposta.getAutor().getNome();
    }

    public Long getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCricacao() {
        return dataCricacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }
}
