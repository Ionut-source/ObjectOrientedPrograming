package ro.ctrln.misc;

import ro.ctrln.inheritance.Battleship;
import ro.ctrln.inheritance.FalconHeavy;
import ro.ctrln.util.ProjectUtils;

public class OveridingUsage {
    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.escapeProcedure(3);
        ProjectUtils.printMessage("-------------------------");
        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.escapeProcedure(10);
        ProjectUtils.printMessage("-------------------------");
        falconHeavy.escapeProcedure();
        ProjectUtils.printMessage("-------------------------");
        falconHeavy.escapeProcedure(false,true, false, false);
        ProjectUtils.printMessage("-------------------------");
        ProjectUtils.printMessage(falconHeavy.escapeProcedure(false));
    }
}