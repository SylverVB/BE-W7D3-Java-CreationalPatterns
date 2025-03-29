public class FirefighterBot extends AbstractRobot {

    public FirefighterBot() {
        setTool("fire hose");
        setPowerLevel(20);
    }

    @Override
    public void recharge() {
        System.out.println("Beep boop beep, firefighter bot now charging.");
        System.out.println("Power level: " + getPowerLevel());
    }

    @Override
    public void doWork() {
        System.out.println("Firefighter bot uses its " + getTool() + " and extinguishes the fire. Yaaay!");
    }
}