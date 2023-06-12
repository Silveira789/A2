package modelo;

public enum TipoUsuario {

    ADMIN("ADMIN", 1),
    USUARIO("USUARIO", 2);

    private String descricao;
    private int id;

    private TipoUsuario(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getId(){
        return id;
    }
}
