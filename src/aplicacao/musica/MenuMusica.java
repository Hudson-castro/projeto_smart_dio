package aplicacao.musica;

public class MenuMusica implements ReprodutorMusica{


    public void tocar () {
        System.out.println(" Tocar musica ");

    }
    public void pausar (){
        System.out.println("Musica esta pausada!! ");

    } 

    public void selecionarMusica (){
        System.out.println("Musica Selecionada! ");


    }


}
