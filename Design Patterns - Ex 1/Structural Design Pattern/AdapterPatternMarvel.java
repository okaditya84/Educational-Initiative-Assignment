// Thor's lightning attack interface
interface LightningAttack {
    void strikeWithLightning();
}

// Iron Man's repulsor attack interface
interface RepulsorAttack {
    void fireRepulsorBeam();
}

// Thor class
class Thor implements LightningAttack {
    public void strikeWithLightning() {
        System.out.println("Thor strikes with lightning!");
    }
}

// Iron Man class
class IronMan implements RepulsorAttack {
    public void fireRepulsorBeam() {
        System.out.println("Iron Man fires repulsor beam!");
    }
}

// Adapter that makes Iron Man's repulsor work like lightning attack
class IronManAdapter implements LightningAttack {
    private IronMan ironMan;

    public IronManAdapter(IronMan ironMan) {
        this.ironMan = ironMan;
    }

    @Override
    public void strikeWithLightning() {
        ironMan.fireRepulsorBeam();
    }
}

// Fight sequence
public class AdapterPatternMarvel {
    public static void main(String[] args) {
        Thor thor = new Thor();
        IronMan ironMan = new IronMan();
        LightningAttack ironManWithLightning = new IronManAdapter(ironMan);

        // Thor and Iron Man attack together using lightning-like attacks
        thor.strikeWithLightning();
        ironManWithLightning.strikeWithLightning(); // Iron Man's repulsor beam is adapted as lightning
    }
}
