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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a"),
    @NamedQuery(name = "Aluno.findByIdAluno", query = "SELECT a FROM Aluno a WHERE a.idAluno = :idAluno"),
    @NamedQuery(name = "Aluno.findByNomeAluno", query = "SELECT a FROM Aluno a WHERE a.nomeAluno = :nomeAluno"),
    @NamedQuery(name = "Aluno.findBySenhaAluno", query = "SELECT a FROM Aluno a WHERE a.senhaAluno = :senhaAluno"),
    @NamedQuery(name = "Aluno.findByFaltas", query = "SELECT a FROM Aluno a WHERE a.faltas = :faltas"),
    @NamedQuery(name = "Aluno.findByTurma", query = "SELECT a FROM Aluno a WHERE a.turma = :turma"),
    @NamedQuery(name = "Aluno.findBySitua\u00e7\u00e3o", query = "SELECT a FROM Aluno a WHERE a.situa\u00e7\u00e3o = :situa\u00e7\u00e3o"),
    @NamedQuery(name = "Aluno.findByNota", query = "SELECT a FROM Aluno a WHERE a.nota = :nota"),
    @NamedQuery(name = "Aluno.findByEMail", query = "SELECT a FROM Aluno a WHERE a.eMail = :eMail"),
    @NamedQuery(name = "Aluno.findByCursoidCurso", query = "SELECT a FROM Aluno a WHERE a.cursoidCurso = :cursoidCurso")})
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAluno")
    private Integer idAluno;
    @Size(max = 45)
    @Column(name = "nomeAluno")
    private String nomeAluno;
    @Size(max = 45)
    @Column(name = "senhaAluno")
    private String senhaAluno;
    @Size(max = 45)
    @Column(name = "faltas")
    private String faltas;
    @Size(max = 45)
    @Column(name = "turma")
    private String turma;
    @Size(max = 45)
    @Column(name = "situa\u00e7\u00e3o")
    private String situação;
    @Size(max = 45)
    @Column(name = "nota")
    private String nota;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "e-mail")
    private String eMail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Curso_idCurso")
    private int cursoidCurso;
    @JoinColumn(name = "Cursos_idCursos", referencedColumnName = "idCursos")
    @ManyToOne(optional = false)
    private Curso cursosidCursos;

    public Aluno() {
    }

    public Aluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public Aluno(Integer idAluno, int cursoidCurso) {
        this.idAluno = idAluno;
        this.cursoidCurso = cursoidCurso;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getSenhaAluno() {
        return senhaAluno;
    }

    public void setSenhaAluno(String senhaAluno) {
        this.senhaAluno = senhaAluno;
    }

    public String getFaltas() {
        return faltas;
    }

    public void setFaltas(String faltas) {
        this.faltas = faltas;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getSituação() {
        return situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public int getCursoidCurso() {
        return cursoidCurso;
    }

    public void setCursoidCurso(int cursoidCurso) {
        this.cursoidCurso = cursoidCurso;
    }

    public Curso getCursosidCursos() {
        return cursosidCursos;
    }

    public void setCursosidCursos(Curso cursosidCursos) {
        this.cursosidCursos = cursosidCursos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAluno != null ? idAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.idAluno == null && other.idAluno != null) || (this.idAluno != null && !this.idAluno.equals(other.idAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Aluno[ idAluno=" + idAluno + " ]";
    }
    
}
