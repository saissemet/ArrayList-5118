public class disciplinas {
    int idDisciplina;
    String nomeDisciplina;
    int horasDisciplina;

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getHorasDisciplina() {
        return horasDisciplina;
    }

    public void setHorasDisciplina(int setHorasDisciplina) {
        this.horasDisciplina = setHorasDisciplina;
    }

    public String toString() {
        return "ID: " + idDisciplina + ", Nome: " + nomeDisciplina + ", Carga Horária: " + horasDisciplina + " horas";
    }
}
