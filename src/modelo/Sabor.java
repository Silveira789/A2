package modelo;

public enum Sabor {

    AMARGO("AMARGO", 1),
    TRADICIONAL("TRADICIONAL", 2),
    MEIO_AMARGO("MEIO_AMARGO", 3),
    BRANCO("BRANCO", 4);

    private String descricao;
    private int id;

    private Sabor(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getId(){
        return id;
    }



    public static Sabor buscarPorId(int id) {
        for(Sabor e : values()) {
            if(e.id == id) return e;
        }
        throw new IllegalArgumentException("Invalid id: " + id);
    }

    public static void listarSabores() {
        for(Sabor e : values()) {
            System.out.println( e.getDescricao());
        }
    }
}

