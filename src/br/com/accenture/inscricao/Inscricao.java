package br.com.accenture.inscricao;

import java.util.Date;
import java.util.LinkedList;

import br.com.accenture.escola.Escola;

public class Inscricao {

    private String nome;
    private String email;
    private Escola escola;
    private LinkedList<Date> horariosDisponiveis;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public LinkedList<Date> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public void setHorariosDisponiveis(LinkedList<Date> horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }

}
