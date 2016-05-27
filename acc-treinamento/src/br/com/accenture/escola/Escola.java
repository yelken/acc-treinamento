package br.com.accenture.escola;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import br.com.accenture.basica.Basica;


@Entity
@Table(name="escola")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  
@AttributeOverrides(value={  
        @AttributeOverride(name="id",column=@Column(name="id")),  
})  
public class Escola extends Basica {

    private String descricao;
    private String endereco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
