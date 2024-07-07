import apple.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        System.out.println("-=Telefone=-");
        iPhone.call();
        iPhone.listen();
        iPhone.startVoiceMail();
        System.out.println("\n-=Navegador da Internet=-");
        iPhone.viewPage("https://dio.me");
        iPhone.addNewTab();
        iPhone.updatePage();
        System.out.println("\n-=Reprodutor de Música=-");
        iPhone.setMusic("Oasis - Sunday Morning Call");
        iPhone.play();
        iPhone.pause();
    }
}