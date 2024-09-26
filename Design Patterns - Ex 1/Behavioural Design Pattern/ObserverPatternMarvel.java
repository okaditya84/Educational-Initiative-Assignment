import java.util.ArrayList;
import java.util.List;

// Observer interface
interface SHIELDObserver {
    void update(String message);
}

// Concrete Observer: SHIELD Agent
class SHIELDAgent implements SHIELDObserver {
    private String name;

    public SHIELDAgent(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received mission update: " + message);
    }
}

// Subject class: Avenger Mission
class AvengerMission {
    private List<SHIELDObserver> agents = new ArrayList<>();

    public void addObserver(SHIELDObserver observer) {
        agents.add(observer);
    }

    public void removeObserver(SHIELDObserver observer) {
        agents.remove(observer);
    }

    public void notifyAgents(String message) {
        for (SHIELDObserver agent : agents) {
            agent.update(message);
        }
    }
}

// Main to test
public class ObserverPatternMarvel {
    public static void main(String[] args) {
        AvengerMission mission = new AvengerMission();

        SHIELDObserver agentCoulson = new SHIELDAgent("Coulson");
        SHIELDObserver agentHill = new SHIELDAgent("Maria Hill");

        mission.addObserver(agentCoulson);
        mission.addObserver(agentHill);

        mission.notifyAgents("The Avengers are heading to Sokovia for battle!");
    }
}
