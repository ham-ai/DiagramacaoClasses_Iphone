package Smartphone;

import java.util.*;

/**
 * 
 */
public interface Iphone {

    public static void main(String[] args) {
        //Instanciando as classes
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        NavegadorNaInternet navegadorNaInternet = new NavegadorNaInternet();

        //Chamando métodos aparelho eletrônico
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();

        //Chamando métodos navegador na internet
        navegadorNaInternet.exibirPagina();
        navegadorNaInternet.adicionarNovaAba();
        navegadorNaInternet.atualizarPagina();

        //Chamando métodos reprodutor musical
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
    }
}