public class Funcionario {

    private String nome;
    private boolean isAdmin;

    public Funcionario(String nome, boolean isAdmin) {
        this.nome = nome;
        this.isAdmin = isAdmin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
