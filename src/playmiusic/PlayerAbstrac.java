package playmiusic;

public abstract class PlayerAbstrac implements PlayerInter{
   protected String name = "";

   public PlayerAbstrac(String name){
        this.name = name;
   }
   @Override
   public void Player(){
        System.out.println("player : " + name);
   }
   @Override
   public void Stop(){
        System.out.println("stop : " + name);
   } 
   @Override
   public void SelectMiusic(String name){
        this.name = name;
        System.out.println("Pressione player para iniciar a musica selecionada: " + this.name);
   }
   public String getName() {
    return name;
  }
}
