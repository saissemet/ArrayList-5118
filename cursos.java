public class cursos {
    int idCurso;
    String nomeCurso;
    int horasCurso;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getHorasCurso() {
        return horasCurso;
    }

    public void setHorasCurso(int horasCurso) {
        this.horasCurso = horasCurso;
    }

    public String toString() {
        return "ID: " + idCurso + ", Nome: " + nomeCurso + ", Horas: " + horasCurso;
    }

    public String toString1() {
        return "ID: " + idCurso + ", Nome: " + nomeCurso;
    }
}
