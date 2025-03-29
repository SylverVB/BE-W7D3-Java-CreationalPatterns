public abstract class AbstractRobot {
    private String tool;
    private int powerLevel;

    public abstract void recharge();
    public abstract void doWork();

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }
}