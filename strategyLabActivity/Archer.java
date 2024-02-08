package strategyLabActivity;

public class Archer implements AttackType{

  public void attack(){
    System.out.println("Archer shoots an arrow!");
  }

  public void defend(){
    System.out.println("Using a shield to defend!");
  }

}