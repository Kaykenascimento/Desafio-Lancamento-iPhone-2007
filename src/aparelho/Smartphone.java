package aparelho;

public class Smartphone {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        System.out.println("Aparelho Telefônico");
        iphone.ligar("11999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("Reprodutor de Música");
        iphone.selecionarMusica("Música de Teste");
        iphone.pausar();

        System.out.println("Navegador de Internet");
        iphone.exibirPagina("www.google.com.br");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

    }
}
