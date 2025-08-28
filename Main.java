public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda("jovens" , "opera");
        Musicas musicas = new Musicas("os jovens",2);
        Empresario empresario = new Empresario("zé" , 53454354);
        Membro membro1 = new Membro("ojoven1","baixo");
        Membro membro2 = new Membro("ojoven2","cantor");
        Membro membro3 = new Membro("ojoven3","baterista");
        Membro membro4 = new Membro("ojoven4","gaita");
        Membro membro5 = new Membro("pedro","piano");
        banda.addmembronovo(membro1);
        banda.addmembronovo(membro2);
        banda.addmembronovo(membro3);
        banda.addmembronovo(membro4);
        banda.addmembronovo(membro5);
        banda.addmusicanova(musicas);
        banda.setEmpresario(empresario);

          banda.mostrainfo();
    }
}
