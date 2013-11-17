/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jader
 */
@Entity
@Table(name = "administrador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a"),
    @NamedQuery(name = "Administrador.findByCodAdministrador", query = "SELECT a FROM Administrador a WHERE a.codAdministrador = :codAdministrador"),
    @NamedQuery(name = "Administrador.findByNome", query = "SELECT a FROM Administrador a WHERE a.nome = :nome"),
    @NamedQuery(name = "Administrador.findByTipo", query = "SELECT a FROM Administrador a WHERE a.tipo = :tipo"),
    @NamedQuery(name = "Administrador.findByEmail", query = "SELECT a FROM Administrador a WHERE a.email = :email"),
    @NamedQuery(name = "Administrador.findBySenha", query = "SELECT a FROM Administrador a WHERE a.senha = :senha"),
    @NamedQuery(name = "Administrador.findByCpf", query = "SELECT a FROM Administrador a WHERE a.cpf = :cpf")})
public class Administrador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CodAdministrador")
    private Integer codAdministrador;
    @Size(max = 45)
    @Column(name = "Nome")
    private String nome;
    @Size(max = 45)
    @Column(name = "Tipo")
    private String tipo;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "senha")
    private String senha;
    @Size(max = 12)
    @Column(name = "CPF")
    private String cpf;

    public Administrador() {
    }

    public Administrador(Integer codAdministrador) {
        this.codAdministrador = codAdministrador;
    }

    public Integer getCodAdministrador() {
        return codAdministrador;
    }

    public void setCodAdministrador(Integer codAdministrador) {
        this.codAdministrador = codAdministrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAdministrador != null ? codAdministrador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.codAdministrador == null && other.codAdministrador != null) || (this.codAdministrador != null && !this.codAdministrador.equals(other.codAdministrador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Administrador[ codAdministrador=" + codAdministrador + " ]";
    }
    
}
