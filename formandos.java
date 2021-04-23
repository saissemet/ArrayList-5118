public class formandos {
    int idFormando;
    String nomeFormando;
    String generoFormando;
    int telefoneFormando;

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

    public String getGeneroFormando() {
        return generoFormando;
    }

    public void setGeneroFormando(String generoFormando) {
        this.generoFormando = generoFormando;
    }

    public int getTelefoneFormando() {
        return telefoneFormando;
    }

    public void setTelefoneFormando(int telefoneFormando) {
        this.telefoneFormando = telefoneFormando;
    }

    public String toString() {
        return "ID: " + idFormando + ", Nome: " + nomeFormando + ", Gênero: " + generoFormando + ", Telefone: "
                + telefoneFormando;
    }
}