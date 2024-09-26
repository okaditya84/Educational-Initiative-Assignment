// Strategy interface
interface AttackStrategy {
    void executeAttack();
}

// Concrete strategy 1: Melee Attack
class MeleeAttack implements AttackStrategy {
    @Override
    public void executeAttack() {
        System.out.println("Using melee attack with super strength!");
    }
}

// Concrete strategy 2: Ranged Attack
class RangedAttack implements AttackStrategy {
    @Override
    public void executeAttack() {
        System.out.println("Using ranged attack with energy blasts!");
    }
}

// Context class: Superhero
class Superhero {
    private String name;
    private AttackStrategy attackStrategy;

    public Superhero(String name, AttackStrategy attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
    }

    public void changeAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        System.out.println(name + " is attacking:");
        attackStrategy.executeAttack();
    }
}

// Main to test
public class StrategyPatternMarvel {
    public static void main(String[] args) {
        Superhero ironMan = new Superhero("Iron Man", new RangedAttack());
        Superhero hulk = new Superhero("Hulk", new MeleeAttack());

        ironMan.attack();
        hulk.attack();

        // Changing strategy during battle
        ironMan.changeAttackStrategy(new MeleeAttack());
        ironMan.attack();
    }
}
