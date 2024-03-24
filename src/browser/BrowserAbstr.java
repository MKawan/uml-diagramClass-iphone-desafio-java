package browser;

public abstract class BrowserAbstr implements BrowserInter{
    protected String url = "";

    public BrowserAbstr(String url){
        this.url = url;
    }

    @Override
    public void InitPage(String url){
        this.url = url;
        System.out.println("Iniciando pagina " + this.url);
    }
    @Override
    public void AddTab(){
        System.out.println("Nova aba");
    }
    @Override
    public void UpdatePage(String url){
        this.url = url;
        System.out.println("Atualizando pagina " + this.url);
    }

    public String getUrl(){
        return url;
    } 
}
