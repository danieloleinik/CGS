public class Usuario {
    private String usuario;
    private String senha;
    private String nome;
    private int anoNascimento;

    public Usuario(String usuario, String senha, String nome, int anoNascimento) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
