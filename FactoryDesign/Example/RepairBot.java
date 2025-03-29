public class RepairBot extends AbstractRobot {

    public RepairBot() {
        setTool("Welding Torch");
        setPowerLevel(10);
    }

    @Override
    public void recharge() {
        System.out.println("Clank, boom, kerchunk! Repair bot now charging.");
        System.out.println("Power level: " + getPowerLevel());
    }

    @Override
    public void doWork() {
        System.out.println("Repair bot uses its " + getTool() + " and fixes everything. Hooray!");
    }
}