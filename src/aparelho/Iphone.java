package aparelho;

import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o Número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o Correio de Voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a url: "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada com Sucesso!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música Selecionada: "+ musica);
        tocar(musica);
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a Música: "+ musica);
    }

    @Override
    public void pausar() {
        System.out.println("Parando a Música");
    }
}
