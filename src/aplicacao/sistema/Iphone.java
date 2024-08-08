package aplicacao.sistema;

import aplicacao.musica.ReprodutorMusica;
import aplicacao.nevegador.MenuNavegador;
import aplicacao.telefone.MenuTelefone;
import aplicacao.telefone.ListaTelefonica;

public class Iphone  implements ReprodutorMusica , MenuTelefone , MenuNavegador {

   
    public void tocar () {
        System.out.println(" Tocar musica ");

    }
    public void pausar (){
        System.out.println("Musica esta pausada!! ");

    } 

    public void selecionarMusica (String musica){
        System.out.println("Musica Selecionada! ");


    }

    public void exibirPagina(String url){
        System.out.println(" Tocar musica ");
    
    System.out.println("Nabegação segura ");
    
    }
    public void adicionarNovaAba(){
    System.out.println(" Nova pesquisa");
    
    }
    public void atualizarPagina(){
    System.out.println("Pagina atualizada ");
    }
    public void ligar (String numero){
        System.out.println("Telefone esta tocando!");
    }
    public  void atender (){
        System.out.println("atender o telefone!!");

    }
    public void iniciarCorrerioVoz (){

        System.out.println("Tem uma msg no correio de voz!!!");

    }


   
}
     
