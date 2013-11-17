/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jader
 */
@Entity
@Table(name = "cursoprofessor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cursoprofessor.findAll", query = "SELECT c FROM Cursoprofessor c"),
    @NamedQuery(name = "Cursoprofessor.findByIdProfessor", query = "SELECT c FROM Cursoprofessor c WHERE c.cursoprofessorPK.idProfessor = :idProfessor"),
    @NamedQuery(name = "Cursoprofessor.findByIdCursos", query = "SELECT c FROM Cursoprofessor c WHERE c.cursoprofessorPK.idCursos = :idCursos"),
    @NamedQuery(name = "Cursoprofessor.findByIdCursoProfessor", query = "SELECT c FROM Cursoprofessor c WHERE c.cursoprofessorPK.idCursoProfessor = :idCursoProfessor")})
public class Cursoprofessor implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CursoprofessorPK cursoprofessorPK;
    @JoinColumn(name = "idProfessor", referencedColumnName = "idProfessor", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Professor professor;
    @JoinColumn(name = "idCursos", referencedColumnName = "idCursos", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Curso curso;

    public Cursoprofessor() {
    }

    public Cursoprofessor(CursoprofessorPK cursoprofessorPK) {
        this.cursoprofessorPK = cursoprofessorPK;
    }

    public Cursoprofessor(int idProfessor, int idCursos, int idCursoProfessor) {
        this.cursoprofessorPK = new CursoprofessorPK(idProfessor, idCursos, idCursoProfessor);
    }

    public CursoprofessorPK getCursoprofessorPK() {
        return cursoprofessorPK;
    }

    public void setCursoprofessorPK(CursoprofessorPK cursoprofessorPK) {
        this.cursoprofessorPK = cursoprofessorPK;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cursoprofessorPK != null ? cursoprofessorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cursoprofessor)) {
            return false;
        }
        Cursoprofessor other = (Cursoprofessor) object;
        if ((this.cursoprofessorPK == null && other.cursoprofessorPK != null) || (this.cursoprofessorPK != null && !this.cursoprofessorPK.equals(other.cursoprofessorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Cursoprofessor[ cursoprofessorPK=" + cursoprofessorPK + " ]";
    }
    
}
