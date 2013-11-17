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
@Table(name = "disciplinas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disciplinas.findAll", query = "SELECT d FROM Disciplinas d"),
    @NamedQuery(name = "Disciplinas.findByIdDisciplinas", query = "SELECT d FROM Disciplinas d WHERE d.idDisciplinas = :idDisciplinas"),
    @NamedQuery(name = "Disciplinas.findByNomeDisciplinas", query = "SELECT d FROM Disciplinas d WHERE d.nomeDisciplinas = :nomeDisciplinas"),
    @NamedQuery(name = "Disciplinas.findByCargaHoraria", query = "SELECT d FROM Disciplinas d WHERE d.cargaHoraria = :cargaHoraria")})
public class Disciplinas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDisciplinas")
    private Integer idDisciplinas;
    @Size(max = 45)
    @Column(name = "nomeDisciplinas")
    private String nomeDisciplinas;
    @Column(name = "cargaHoraria")
    private Integer cargaHoraria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "disciplinas")
    private Collection<Cursodisciplinas> cursodisciplinasCollection;

    public Disciplinas() {
    }

    public Disciplinas(Integer idDisciplinas) {
        this.idDisciplinas = idDisciplinas;
    }

    public Integer getIdDisciplinas() {
        return idDisciplinas;
    }

    public void setIdDisciplinas(Integer idDisciplinas) {
        this.idDisciplinas = idDisciplinas;
    }

    public String getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @XmlTransient
    public Collection<Cursodisciplinas> getCursodisciplinasCollection() {
        return cursodisciplinasCollection;
    }

    public void setCursodisciplinasCollection(Collection<Cursodisciplinas> cursodisciplinasCollection) {
        this.cursodisciplinasCollection = cursodisciplinasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDisciplinas != null ? idDisciplinas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disciplinas)) {
            return false;
        }
        Disciplinas other = (Disciplinas) object;
        if ((this.idDisciplinas == null && other.idDisciplinas != null) || (this.idDisciplinas != null && !this.idDisciplinas.equals(other.idDisciplinas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Disciplinas[ idDisciplinas=" + idDisciplinas + " ]";
    }
    
}
