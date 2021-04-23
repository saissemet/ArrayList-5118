public class DisciplinasCurso {
    String nomeCurso;
    String nomeDisciplina;
    int idCurso;
    int idDisciplina;
    int horasDisciplina;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getHorasDisciplina() {
        return horasDisciplina;
    }

    public void setHorasDisciplina(int horasDisciplina) {
        this.horasDisciplina = horasDisciplina;
    }

    public String toString() {
        return "Curso: " + nomeCurso + ", Disciplina: " + nomeDisciplina;
    }

}