public class Membro {
    private String nome;
    private String funcao;

     public Membro(String nome , String funcao)
    {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getfuncao() {
        return this.funcao;
    }

    public void setfuncao(String funcao) {
        this.funcao = funcao;
    }
}
