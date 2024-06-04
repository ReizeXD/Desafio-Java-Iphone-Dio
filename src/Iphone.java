public class Iphone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public Iphone(){
        this.reprodutorMusical= new ReprodutorMusical();
        this.aparelhoTelefonico=new AparelhoTelefonico();
        this.navegadorInternet= new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutorMusical(){
        return reprodutorMusical;
    }
  
    public AparelhoTelefonico getAparelhoTelefonico(){
        return aparelhoTelefonico;
    }
  
    public NavegadorInternet getNavegadorInternet(){
        return navegadorInternet;
    }
  
    public static void main(String[] args) {
        Iphone iphone= new Iphone();
        iphone.getReprodutorMusical().selecionarMusica("Hino Brasileiro");
        iphone.getReprodutorMusical().tocar();
        iphone.getReprodutorMusical().pausar();

        iphone.getAparelhoTelefonico().ligar("82974895824");
        iphone.getAparelhoTelefonico().atender();
        iphone.getAparelhoTelefonico().iniciarCorreioVoz();

        iphone.getNavegadorInternet().exibirPagina("wwww.teste.com");
        iphone.getNavegadorInternet().adicionarNovaAba();
        iphone.getNavegadorInternet().atualizarPagina();
    }
}
