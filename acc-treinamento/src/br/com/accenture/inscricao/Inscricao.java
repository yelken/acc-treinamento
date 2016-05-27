package br.com.accenture.inscricao;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.accenture.basica.Basica;
import br.com.accenture.escola.Escola;
import br.com.accenture.horario.Horario;


@Entity
@Table(name="inscricao")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  
@AttributeOverrides(value={  
        @AttributeOverride(name="id",column=@Column(name="id")),  
})  
public class Inscricao extends Basica {

    private String nome;
    private String email;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_escola")
    private Escola escola;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_horario")
    private Horario horario;

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

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
