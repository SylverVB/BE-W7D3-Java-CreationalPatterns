import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        RobotFactory botFactory = new RobotFactory();
        AbstractRobot bot = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of robot would you like?");
        System.out.println("r for Repair bot");
        System.out.println("f for Firefighter bot");
        System.out.println("j for Janitor bot");

        String typeOfBot = userInput.nextLine();
        bot = botFactory.buildRobot(typeOfBot);

        if (bot != null) {
            doRobotStuff(bot);
        }

        userInput.close();
    }

    public static void doRobotStuff(AbstractRobot bot) {
        bot.doWork();
        bot.recharge();
    }
}