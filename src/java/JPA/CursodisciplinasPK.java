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
public class CursodisciplinasPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCursoDisciplinas")
    private int idCursoDisciplinas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCursos")
    private int idCursos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDisciplinas")
    private int idDisciplinas;

    public CursodisciplinasPK() {
    }

    public CursodisciplinasPK(int idCursoDisciplinas, int idCursos, int idDisciplinas) {
        this.idCursoDisciplinas = idCursoDisciplinas;
        this.idCursos = idCursos;
        this.idDisciplinas = idDisciplinas;
    }

    public int getIdCursoDisciplinas() {
        return idCursoDisciplinas;
    }

    public void setIdCursoDisciplinas(int idCursoDisciplinas) {
        this.idCursoDisciplinas = idCursoDisciplinas;
    }

    public int getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(int idCursos) {
        this.idCursos = idCursos;
    }

    public int getIdDisciplinas() {
        return idDisciplinas;
    }

    public void setIdDisciplinas(int idDisciplinas) {
        this.idDisciplinas = idDisciplinas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCursoDisciplinas;
        hash += (int) idCursos;
        hash += (int) idDisciplinas;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursodisciplinasPK)) {
            return false;
        }
        CursodisciplinasPK other = (CursodisciplinasPK) object;
        if (this.idCursoDisciplinas != other.idCursoDisciplinas) {
            return false;
        }
        if (this.idCursos != other.idCursos) {
            return false;
        }
        if (this.idDisciplinas != other.idDisciplinas) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.CursodisciplinasPK[ idCursoDisciplinas=" + idCursoDisciplinas + ", idCursos=" + idCursos + ", idDisciplinas=" + idDisciplinas + " ]";
    }
    
}
