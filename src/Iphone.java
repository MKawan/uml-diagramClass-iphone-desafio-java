import browser.Browser;
import phone.Phone;
import playmiusic.PlayerMiusic;

public class Iphone {
    //player miusic

    public static void main(String[] args) {

        System.out.println("<<-------------Player------------->>");
        String nameMiusic = "November Rain";
        PlayerMiusic playerMiusic = new PlayerMiusic(nameMiusic);
        playerMiusic.SelectMiusic(nameMiusic);
        playerMiusic.Player();
        playerMiusic.Stop();

        System.out.println("\n<<-------------Phone------------->>");
        int numero = 615265589;
        Phone phone = new Phone(numero);
        phone.ToConnect(numero);
        phone.ToMeet(numero);
        phone.StartVoxMail(numero);

        System.out.println("\n<<-------------Browser------------->>");
        String url = "exemplo.com";
        Browser browser = new Browser(url);
        browser.InitPage(url);
        browser.AddTab();
        browser.UpdatePage(url);
    }
}
