package ro.ctrln.inheritance;

import ro.ctrln.util.ProjectUtils;

public class Inheritance {

    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.setBattleshipName("Terran Battleship");
        battleship.setBattleshipCapacity(20000);
        ProjectUtils.printMessage(battleship);

        ImperialStarDestroyer  imperialStarDestroyer = new ImperialStarDestroyer();
        imperialStarDestroyer.setBattleshipName("Imperial Star Destroyer");
        imperialStarDestroyer.setBattleshipCapacity(30000);
        imperialStarDestroyer.setNumberOfDecks(30);
        ProjectUtils.printMessage("ImperialStarDestroyer is: " + imperialStarDestroyer);

        //Starship starship = new Starship();
        XWingStarFighter xWingStarFighter = new XWingStarFighter();
        xWingStarFighter.setStarshipDestination("base");
        ProjectUtils.printMessage("Velocity for XwingStarFighter is: " + xWingStarFighter.computeWarpSpeed(3,1000));
        xWingStarFighter.warp();
        ProjectUtils.printMessage("xWingStarFighter is: " + xWingStarFighter);

        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("base");
        ProjectUtils.printMessage("Velocity for TieFighter is " + tieFighter.computeWarpSpeed(3,1000));
        tieFighter.warp();
        ProjectUtils.printMessage("TieFighter is: " + tieFighter);

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy");
        falconHeavy.setBattleshipCapacity(10);
        falconHeavy.setDestination("Moon");
        ProjectUtils.printMessage("FalconHeavy is: " + falconHeavy);

        falconHeavy.setStarshipDestination("Mars");
        ProjectUtils.printMessage("FalconHeavy is: " + falconHeavy);

        falconHeavy.louchCountdown();

        }
}
