public class Banda {
    private String nome;
    private String genero;
    private Empresario empresario;
    private Musicas[] musicas = new Musicas[5];
    private Membro[] membros = new Membro[5];


    public Banda(String nome , String genero)
    {
        this.nome = nome;
        this.genero = genero;
    }

    void addmusicanova(Musicas novamusicas){

        for(int i = 0; i < musicas.length ; i++)
       {
            if(musicas[i] == null)
            {
                musicas[i] = novamusicas;
                break;
            }

       }
    }


    void addmembronovo(Membro novomembro){
        for(int i = 0; i < membros.length ; i++)
        {
            if(membros[i] == null)
            {
                membros[i] = novomembro;
                break;
            }

        }

   }
  void mostrainfo(){
        for(Musicas musica : musicas )
            if(musica != null )
            {
                System.out.println(musica.getNome());
            }
        for(Membro membro : membros)
        {
            if(membro != null)
            {
                System.out.println(membro.getNome());
                System.out.println(membro.getfuncao());
            }
        }


            if(empresario != null) {
                System.out.println(empresario.getNome());
                System.out.println(empresario.getCnpj());
            }

   }
   public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
   }
}
