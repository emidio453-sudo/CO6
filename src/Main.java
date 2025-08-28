//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();
        Cantina cantina = new Cantina();

        cantina.nome = "Cantina do inatel";
        salgado1.nome = "coxinha";
        salgado2.nome = "pastel";
        salgado3.nome = "esfirra";

        cantina.addsalgados(salgado1);
        cantina.addsalgados(salgado2);
        cantina.addsalgados(salgado3);

        cantina.mostrainfo();
    }
}