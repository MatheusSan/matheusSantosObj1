package model;

import java.util.Objects;

public class Turma implements Comparable{
    private int id;
    private String turno;
    private int qtdVagas;
    private int vagasOcupadas;
    private String curso;

    public Turma(){

    }

    public Turma(int id, String turno, int qtdVagas, int vagasOcupadas, String curso) {
        this.id = id;
        this.turno = turno;
        this.qtdVagas = qtdVagas;
        this.vagasOcupadas = vagasOcupadas;
        this.curso = curso;
    }

    public Turma(int id, String curso) {
        this.id = id;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    public void setVagasOcupadas(int vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", turno='" + turno + '\'' +
                ", qtdVagas=" + qtdVagas +
                ", vagasOcupadas=" + vagasOcupadas +
                ", curso='" + curso + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Turma)) return false;
        Turma turma = (Turma) o;
        return getId() == turma.getId() &&
                getQtdVagas() == turma.getQtdVagas() &&
                getVagasOcupadas() == turma.getVagasOcupadas() &&
                Objects.equals(getTurno(), turma.getTurno()) &&
                Objects.equals(getCurso(), turma.getCurso());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public int compareTo(Object o) {
        if(this.getId()>((Turma)o).getId()){
            return 1;
        }
        if(this.getId()<((Turma)o).getId()){
            return -1;
        }
        return 0;
    }
}
