import java.util.List;
import java.util.ArrayList;


// Superhero interface
interface Superhero {
    void attack();
}

// Individual superhero: Captain America
class CaptainAmerica implements Superhero {
    @Override
    public void attack() {
        System.out.println("Captain America throws his shield!");
    }
}

// Individual superhero: Iron Man
class IronMan implements Superhero {
    @Override
    public void attack() {
        System.out.println("Iron Man fires repulsor beams!");
    }
}

// Individual superhero: Black Widow
class BlackWidow implements Superhero {
    @Override
    public void attack() {
        System.out.println("Black Widow attacks with martial arts!");
    }
}

// Composite class: Avengers team
class AvengersTeam implements Superhero {
    private List<Superhero> members = new ArrayList<>();

    public void addMember(Superhero hero) {
        members.add(hero);
    }

    public void removeMember(Superhero hero) {
        members.remove(hero);
    }

    @Override
    public void attack() {
        System.out.println("The Avengers are attacking as a team!");
        for (Superhero hero : members) {
            hero.attack();
        }
    }
}

// Fight sequence
public class CompositePatternMarvel {
    public static void main(String[] args) {
        // Individual heroes
        CaptainAmerica cap = new CaptainAmerica();
        IronMan ironMan = new IronMan();
        BlackWidow widow = new BlackWidow();

        // Avengers team (composite)
        AvengersTeam avengers = new AvengersTeam();
        avengers.addMember(cap);
        avengers.addMember(ironMan);
        avengers.addMember(widow);

        // Individual attacks
        cap.attack();
        ironMan.attack();
        widow.attack();

        // Team attack
        avengers.attack(); // All heroes attack together
    }
}
