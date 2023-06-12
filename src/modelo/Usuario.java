package modelo;

public class Usuario {
    private String login;
    private String senha;
    private String telefone;
    private TipoUsuario tipoUsuario;

    //
    public Usuario(String login, String senha, String telefone, TipoUsuario tipoUsuario) {
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
    }
    //
    public Usuario() {
    }

    //
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
