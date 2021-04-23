public class Inscricoes {
    int idInscricao;
    int idCurso;
    String nomeCurso;
    int idFormando;
    String nomeFormando;
    
    public int getIdInscricao() {
        return idInscricao;
    }

    public void setIdInscricao(int idInscricao) {
        this.idInscricao = idInscricao;
    }

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

    public int getIdFormando() {
        return idFormando;
    }

    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
    }

    public String getNomeFormando() {
        return nomeFormando;
    }

    public void setNomeFormando(String nomeFormando) {
        this.nomeFormando = nomeFormando;
    }

    public String toString() {
        return "ID Inscrição: " + idInscricao + ", Curso: " + nomeCurso + ", Formando: " + nomeFormando;
    }

}
