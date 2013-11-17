/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Jader
 */
@Embeddable
public class CursoprofessorPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "idProfessor")
    private int idProfessor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCursos")
    private int idCursos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCursoProfessor")
    private int idCursoProfessor;

    public CursoprofessorPK() {
    }

    public CursoprofessorPK(int idProfessor, int idCursos, int idCursoProfessor) {
        this.idProfessor = idProfessor;
        this.idCursos = idCursos;
        this.idCursoProfessor = idCursoProfessor;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public int getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(int idCursos) {
        this.idCursos = idCursos;
    }

    public int getIdCursoProfessor() {
        return idCursoProfessor;
    }

    public void setIdCursoProfessor(int idCursoProfessor) {
        this.idCursoProfessor = idCursoProfessor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProfessor;
        hash += (int) idCursos;
        hash += (int) idCursoProfessor;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursoprofessorPK)) {
            return false;
        }
        CursoprofessorPK other = (CursoprofessorPK) object;
        if (this.idProfessor != other.idProfessor) {
            return false;
        }
        if (this.idCursos != other.idCursos) {
            return false;
        }
        if (this.idCursoProfessor != other.idCursoProfessor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.CursoprofessorPK[ idProfessor=" + idProfessor + ", idCursos=" + idCursos + ", idCursoProfessor=" + idCursoProfessor + " ]";
    }
    
}
