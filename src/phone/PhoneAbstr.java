package phone;

public abstract class PhoneAbstr implements PhoneInter{
    protected int number = 0;

    public PhoneAbstr(int number){
        this.number = number;
    }
    @Override
    public void ToConnect(int number){
        this.number = number;
        System.out.println("Ligando para " + this.number);
    }
    @Override
    public void ToMeet(int number){
        this.number = number;
        System.out.println("Desligando chamada do contato " + this.number);
    }
    @Override
    public void StartVoxMail(int number){
        this.number = number;
        System.out.println("Iniciando recado de voz do " + this.number);
    }

    public int getNumber(){
        return number;
    }
}
