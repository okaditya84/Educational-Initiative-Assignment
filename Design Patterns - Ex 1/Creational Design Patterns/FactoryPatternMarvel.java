// Product interface: Avenger
interface Avenger {
    void assemble();
}

// Concrete Product 1: Iron Man
class IronMan implements Avenger {
    @Override
    public void assemble() {
        System.out.println("Iron Man is assembled.");
    }
}

// Concrete Product 2: Captain America
class CaptainAmerica implements Avenger {
    @Override
    public void assemble() {
        System.out.println("Captain America is assembled.");
    }
}

// Factory class: AvengerFactory
class AvengerFactory {
    public static Avenger getAvenger(String type) {
        if ("IronMan".equalsIgnoreCase(type)) {
            return new IronMan();
        } else if ("CaptainAmerica".equalsIgnoreCase(type)) {
            return new CaptainAmerica();
        }
        return null;
    }
}

// Main to test
public class FactoryPatternMarvel {
    public static void main(String[] args) {
        Avenger ironMan = AvengerFactory.getAvenger("IronMan");
        ironMan.assemble();

        Avenger captainAmerica = AvengerFactory.getAvenger("CaptainAmerica");
        captainAmerica.assemble();
    }
}
