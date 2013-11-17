/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jader
 */
@Entity
@Table(name = "professor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Professor.findAll", query = "SELECT p FROM Professor p"),
    @NamedQuery(name = "Professor.findByIdProfessor", query = "SELECT p FROM Professor p WHERE p.idProfessor = :idProfessor"),
    @NamedQuery(name = "Professor.findByNomeProfessor", query = "SELECT p FROM Professor p WHERE p.nomeProfessor = :nomeProfessor"),
    @NamedQuery(name = "Professor.findByFone", query = "SELECT p FROM Professor p WHERE p.fone = :fone"),
    @NamedQuery(name = "Professor.findByEMail", query = "SELECT p FROM Professor p WHERE p.eMail = :eMail"),
    @NamedQuery(name = "Professor.findByTitulacao", query = "SELECT p FROM Professor p WHERE p.titulacao = :titulacao")})
public class Professor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idProfessor")
    private Integer idProfessor;
    @Size(max = 45)
    @Column(name = "nomeProfessor")
    private String nomeProfessor;
    @Size(max = 45)
    @Column(name = "fone")
    private String fone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "e-mail")
    private String eMail;
    @Size(max = 45)
    @Column(name = "titulacao")
    private String titulacao;
    @JoinColumn(name = "Departamento_idDepartamento", referencedColumnName = "idDepartamento")
    @ManyToOne(optional = false)
    private Departamento departamentoidDepartamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professor")
    private Collection<Cursoprofessor> cursoprofessorCollection;

    public Professor() {
    }

    public Professor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Departamento getDepartamentoidDepartamento() {
        return departamentoidDepartamento;
    }

    public void setDepartamentoidDepartamento(Departamento departamentoidDepartamento) {
        this.departamentoidDepartamento = departamentoidDepartamento;
    }

    @XmlTransient
    public Collection<Cursoprofessor> getCursoprofessorCollection() {
        return cursoprofessorCollection;
    }

    public void setCursoprofessorCollection(Collection<Cursoprofessor> cursoprofessorCollection) {
        this.cursoprofessorCollection = cursoprofessorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfessor != null ? idProfessor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if ((this.idProfessor == null && other.idProfessor != null) || (this.idProfessor != null && !this.idProfessor.equals(other.idProfessor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Professor[ idProfessor=" + idProfessor + " ]";
    }
    
}
