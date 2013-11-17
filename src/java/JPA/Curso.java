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
@Table(name = "curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c"),
    @NamedQuery(name = "Curso.findByIdCursos", query = "SELECT c FROM Curso c WHERE c.idCursos = :idCursos"),
    @NamedQuery(name = "Curso.findByIdDisciplinas", query = "SELECT c FROM Curso c WHERE c.idDisciplinas = :idDisciplinas"),
    @NamedQuery(name = "Curso.findByCoordenador", query = "SELECT c FROM Curso c WHERE c.coordenador = :coordenador"),
    @NamedQuery(name = "Curso.findByNomeCurso", query = "SELECT c FROM Curso c WHERE c.nomeCurso = :nomeCurso")})
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCursos")
    private Integer idCursos;
    @Size(max = 45)
    @Column(name = "IdDisciplinas")
    private String idDisciplinas;
    @Size(max = 45)
    @Column(name = "coordenador")
    private String coordenador;
    @Size(max = 45)
    @Column(name = "nomeCurso")
    private String nomeCurso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cursosidCursos")
    private Collection<Aluno> alunoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
    private Collection<Cursodisciplinas> cursodisciplinasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
    private Collection<Cursoprofessor> cursoprofessorCollection;

    public Curso() {
    }

    public Curso(Integer idCursos) {
        this.idCursos = idCursos;
    }

    public Integer getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(Integer idCursos) {
        this.idCursos = idCursos;
    }

    public String getIdDisciplinas() {
        return idDisciplinas;
    }

    public void setIdDisciplinas(String idDisciplinas) {
        this.idDisciplinas = idDisciplinas;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @XmlTransient
    public Collection<Aluno> getAlunoCollection() {
        return alunoCollection;
    }

    public void setAlunoCollection(Collection<Aluno> alunoCollection) {
        this.alunoCollection = alunoCollection;
    }

    @XmlTransient
    public Collection<Cursodisciplinas> getCursodisciplinasCollection() {
        return cursodisciplinasCollection;
    }

    public void setCursodisciplinasCollection(Collection<Cursodisciplinas> cursodisciplinasCollection) {
        this.cursodisciplinasCollection = cursodisciplinasCollection;
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
        hash += (idCursos != null ? idCursos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.idCursos == null && other.idCursos != null) || (this.idCursos != null && !this.idCursos.equals(other.idCursos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Curso[ idCursos=" + idCursos + " ]";
    }
    
}
