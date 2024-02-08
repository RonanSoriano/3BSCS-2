package strategyLabActivity;

public class Character {

    private AttackType type;

    public Character(AttackType type) {
        this.type = type;
    }


    public void attack(){
        type.attack();
    }

    public void defend(){
        type.defend();
    }
}