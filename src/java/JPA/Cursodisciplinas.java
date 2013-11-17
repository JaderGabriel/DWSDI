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
@Table(name = "cursodisciplinas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cursodisciplinas.findAll", query = "SELECT c FROM Cursodisciplinas c"),
    @NamedQuery(name = "Cursodisciplinas.findByIdCursoDisciplinas", query = "SELECT c FROM Cursodisciplinas c WHERE c.cursodisciplinasPK.idCursoDisciplinas = :idCursoDisciplinas"),
    @NamedQuery(name = "Cursodisciplinas.findByIdCursos", query = "SELECT c FROM Cursodisciplinas c WHERE c.cursodisciplinasPK.idCursos = :idCursos"),
    @NamedQuery(name = "Cursodisciplinas.findByIdDisciplinas", query = "SELECT c FROM Cursodisciplinas c WHERE c.cursodisciplinasPK.idDisciplinas = :idDisciplinas")})
public class Cursodisciplinas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CursodisciplinasPK cursodisciplinasPK;
    @JoinColumn(name = "idCursoDisciplinas", referencedColumnName = "idDisciplinas", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Disciplinas disciplinas;
    @JoinColumn(name = "idCursos", referencedColumnName = "idCursos", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Curso curso;

    public Cursodisciplinas() {
    }

    public Cursodisciplinas(CursodisciplinasPK cursodisciplinasPK) {
        this.cursodisciplinasPK = cursodisciplinasPK;
    }

    public Cursodisciplinas(int idCursoDisciplinas, int idCursos, int idDisciplinas) {
        this.cursodisciplinasPK = new CursodisciplinasPK(idCursoDisciplinas, idCursos, idDisciplinas);
    }

    public CursodisciplinasPK getCursodisciplinasPK() {
        return cursodisciplinasPK;
    }

    public void setCursodisciplinasPK(CursodisciplinasPK cursodisciplinasPK) {
        this.cursodisciplinasPK = cursodisciplinasPK;
    }

    public Disciplinas getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplinas disciplinas) {
        this.disciplinas = disciplinas;
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
        hash += (cursodisciplinasPK != null ? cursodisciplinasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cursodisciplinas)) {
            return false;
        }
        Cursodisciplinas other = (Cursodisciplinas) object;
        if ((this.cursodisciplinasPK == null && other.cursodisciplinasPK != null) || (this.cursodisciplinasPK != null && !this.cursodisciplinasPK.equals(other.cursodisciplinasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Cursodisciplinas[ cursodisciplinasPK=" + cursodisciplinasPK + " ]";
    }
    
}
