class NickFuryCommand {
    private static NickFuryCommand instance;

    private NickFuryCommand() {}

    public static NickFuryCommand getInstance() {
        if (instance == null) {
            instance = new NickFuryCommand();
        }
        return instance;
    }

    public void giveCommand(String command) {
        System.out.println("Nick Fury: " + command);
    }
}

// Main to test
public class SingletonPatternMarvel {
    public static void main(String[] args) {
        NickFuryCommand command1 = NickFuryCommand.getInstance();
        command1.giveCommand("Avengers, assemble!");

        NickFuryCommand command2 = NickFuryCommand.getInstance();
        command2.giveCommand("Deploy team to Wakanda!");

        // Both command1 and command2 should be the same instance
        System.out.println(command1 == command2);  // true
    }
}
