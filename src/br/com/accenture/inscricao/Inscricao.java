package br.com.accenture.inscricao;

import java.util.Date;
import java.util.LinkedList;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import br.com.accenture.basica.Basica;
import br.com.accenture.escola.Escola;


@Entity
@Table(name="escola")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  
@AttributeOverrides(value={  
        @AttributeOverride(name="id",column=@Column(name="id")),  
})  
public class Inscricao extends Basica {

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
