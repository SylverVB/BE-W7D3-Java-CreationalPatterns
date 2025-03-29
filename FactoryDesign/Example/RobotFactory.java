public class RobotFactory {
    public AbstractRobot buildRobot(String robotType) {
        switch (robotType.toLowerCase()) {
            case "f":
                return new FirefighterBot();
            case "r":
                return new RepairBot();
            case "j":
                return new JanitorBot();
            default:
                System.out.println("Invalid robot type. Please choose 'r', 'f', or 'j'.");
                return null;
        }
    }
}