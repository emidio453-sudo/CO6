public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[3];

    void addsalgados(Salgado novosalgado){
        for(int i=0;i< salgados.length;i++)
        {
                if(salgados[i] == null) {
                    salgados[i] = novosalgado;
                    break;
                }
        }
    }
    void mostrainfo()
    {
        for(Salgado salgado : salgados)
        {
            if(salgado != null) {
                System.out.println(salgado.nome);
            }
        }
    }

}
