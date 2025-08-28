public class Musicas {
    private String nome;
    private double duracao;

    public Musicas (String nome , double duracao)
    {
        this.nome = nome;
        this.duracao = duracao ;
    }

    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getduracao() {
        return this.duracao;
    }

    public void setduracao(double duracao) {
        this.duracao = duracao;
    }

}
