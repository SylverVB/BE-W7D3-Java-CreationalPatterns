public class JanitorBot extends AbstractRobot {

    public JanitorBot() {
        setTool("Vacuum");
        setPowerLevel(5);
    }

    @Override
    public void recharge() {
        System.out.println("Whir, buzz, buzz, Janitor bot now powering up.");
        System.out.println("Power level: " + getPowerLevel());
    }

    @Override
    public void doWork() {
        System.out.println("Janitor bot uses its " + getTool() + " and cleans everything. That's pretty cool I guess...");
    }
}