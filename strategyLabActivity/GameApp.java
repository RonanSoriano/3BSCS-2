package strategyLabActivity;

public class GameApp {
    public static void main(String[] args){
        
        Character ronan = new Character(new Knight());
        Character chuwu = new Character(new Wizzard());
        Character angelo = new Character(new Archer());

        ronan.attack();
        ronan.defend();
        System.out.println();

        chuwu.attack();
        chuwu.defend();
        System.out.println();

        angelo.attack();
        angelo.defend();

        AttackType.sw
    }
    
}
