package aplicacao.sistema;

import java.util.Scanner;

import aplicacao.musica.MenuMusica;
import aplicacao.musica.ReprodutorMusica;
import aplicacao.nevegador.Navegador;
import aplicacao.nevegador.Pesquisa;
import aplicacao.telefone.AparelhoTelefonico;
import aplicacao.telefone.ListaTelefonica;

public class Menu {

    public static void main(String[] args) {

        AparelhoTelefonico telefone = new ListaTelefonica();
        ReprodutorMusica musica = new MenuMusica ();
        Navegador web = new Pesquisa();


        final int TELEFONE = 1 ; 
        final int  MUSICA= 2 ;
        final int NAVEGADOR = 3 ; 

        Scanner sc = new Scanner(System.in);
        
        System.out.println("          WECOME IPHONE           ");
        System.out.println("--------------------------------- ");
        System.out.println(" 1) TELEFONE  ");
        System.out.println(" 2) MUSICA ");
        System.out.println(" 3)NAVEGADOR ");
        System.out.println("--------------------------------- ");
        System.out.print(" BUSCAR APLICATIVO ");
        int busca = sc.nextInt() ; 

        switch (busca) {

            case 1 : 
            System.out.println("TELEFONE");
            System.err.println("1) ligar ");
            System.err.println("2) atender ");
            System.err.println("3) correio de voz ");
            busca = sc.nextInt();
            if (busca == 1 ) {
                telefone.ligar();
            }else if (busca == 2 ) {
                telefone.atender();
                
            }else if (busca == 3 ) {
                telefone.iniciarCorrerioVoz();

            }else {
                System.out.println("Digite uma opção valida ");
            }
                break;

            case 2:

            System.out.println("MUSICA");
            System.err.println("1) Tocar ");
            System.err.println("2) Pausar ");
            System.err.println("3) Selecionar ");
            busca = sc.nextInt();

            if (busca == 1 ) {
                musica.tocar();
            }else if (busca == 2 ) {
                musica.pausar ();
                
            }else if (busca == 3 ) {
                musica.selecionarMusica();

            }else {
                System.out.println("Digite uma opção valida ");
            }
                
                break;
        
      
                
           case 3:
           System.out.println("NAVEGADOR ");
           System.err.println("1) Pesquisa ");
           System.err.println("2) Nova pesquisa ");
           System.err.println("3) Atualizar pagina ");

           busca = sc.nextInt();
           
           if (busca == 1 ) {
               web.exibirPagina();

           }else if (busca == 2 ) {
             web.adicionarNovaAba();
               
           }else if (busca == 3 ) {
               web.atualizarPagina();

           }else {
               System.out.println("Digite uma opção valida ");
           }
                
                break;
             
        }
        sc.close();
    }

}
