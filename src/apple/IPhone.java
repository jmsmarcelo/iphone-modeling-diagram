package apple;

public class IPhone implements Phone, WebBrowser, MusicPlayer {
    //Phone
    @Override
    public void call() {
        System.out.println("Fazendo uma Ligação...");
    }
    @Override
    public void listen() {
        System.out.println("Atendendo uma Ligação...");
    }
    @Override
    public void startVoiceMail() {
        System.out.println("Iniciando Correio de Voz...");
    }
    //Web Browser
    @Override
    public void viewPage(String url) {
        System.out.println("Exibindo a página " + url);
    }
    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba...");
    }
    @Override
    public void updatePage() {
        System.out.println("Atualizando a Página...");
    }
    //Music Player
    @Override
    public void setMusic(String music) {
        System.out.println("Selecionando a Música " + music);
    }
    @Override
    public void play() {
        System.out.println("Reproduzindo a música...");
    }
    @Override
    public void pause() {
        System.out.println("Pausando a música...");
    }
}
