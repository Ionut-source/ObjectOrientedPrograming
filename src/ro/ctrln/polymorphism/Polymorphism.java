package ro.ctrln.polymorphism;

import ro.ctrln.inheritance.*;
import ro.ctrln.util.ProjectUtils;

public class Polymorphism {

    public static void main(String[] args) {
        Battleship battleship = new Battleship();
        ImperialStarDestroyer imperialStarDestroyer= new ImperialStarDestroyer();
        TieFighter tieFighter = new TieFighter();
        XWingStarFighter xWingStarFighter = new XWingStarFighter();
        FalconHeavy falconHeavy = new FalconHeavy();

        ProjectUtils.printMessage("battleship instanceof Object: " + (battleship instanceof Object ));
        ProjectUtils.printMessage("battleship instanceof Battleship: " + (battleship instanceof Battleship ));
        ProjectUtils.printMessage("battleship instanceof ImperialStarDestroyer: " + (battleship instanceof ImperialStarDestroyer ));
        ProjectUtils.printMessage("battleship instanceof FalconHeavy: " + (battleship instanceof FalconHeavy));

        ProjectUtils.printMessage("imperialStarDestroyer instanceof Object: " + (imperialStarDestroyer instanceof Object));
        ProjectUtils.printMessage("imparialStarDestroyer instanceof ImperialStarDestroyer: " + (imperialStarDestroyer instanceof  ImperialStarDestroyer));
        ProjectUtils.printMessage("imperialStarDestroyer instanceof Battleship: " + (imperialStarDestroyer instanceof  Battleship));
        //ProjectUtils.printMessage("imperialStarDdestroyer instaceof TieFighter: " + (imperialStarDestroyer instanceof  TieFighter));

        ProjectUtils.printMessage("tieFighter instanceof Object: " + (tieFighter instanceof Object));
        ProjectUtils.printMessage("tieFighter instanceof TieFighter: " + (tieFighter instanceof TieFighter));
        ProjectUtils.printMessage("tieFighter instanceof Starship: " + (tieFighter instanceof Starship));
        //ProjectUtils.printMessage("tieFighter instanceof ImperialStarDdestroyer:" + (tieFighter instanceof ImperialStarDestroyer));

        ProjectUtils.printMessage("xWingStarFighter instanceof Object: " + (xWingStarFighter instanceof Object));
        ProjectUtils.printMessage("xWingStarFighter instanceof xWingStarFighter: " + (xWingStarFighter instanceof XWingStarFighter));
        ProjectUtils.printMessage("xWingStarFighter instanceof Starship: " + (xWingStarFighter instanceof  Starship));
        ProjectUtils.printMessage("xWingStarFighter instanceof Rocket: " + (xWingStarFighter instanceof  Rocket));

        ProjectUtils.printMessage("falconHeavy instanceof Object: " + (falconHeavy instanceof  Object));
        ProjectUtils.printMessage("falconHeavy instanceof FalconHeavy: " + (falconHeavy instanceof FalconHeavy));
        ProjectUtils.printMessage("falconHeavy instanceof Battleship: " + (falconHeavy instanceof Battleship));
        ProjectUtils.printMessage("falconHeavy instanceof Starship: " + (falconHeavy instanceof Starship));
        ProjectUtils.printMessage("falconHeavy instanceof Rocket: " + (falconHeavy instanceof Rocket));

        //ProjectUtils.printMessage("falconHeavy instanceof TieFighter: " + (falconHeavy instanceof TieFighter));

    }
}
