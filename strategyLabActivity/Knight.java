package strategyLabActivity;

public class Knight implements AttackType{

    @Override
    public void attack(){
        swing.attack();
      }
    
      public void defend(){
        System.out.println("Using a shield to defend!");
	    System.out.println("Dodgin to avoid attack!");
        System.out.println("Creating a magic barrier for defense!");	
      }
    
    
}