package ro.ctrln.inheritance;

import ro.ctrln.util.ProjectUtils;

public class ConstantUsage {

    public static void main(String[] args) {

        ProjectUtils.printMessage(Battleship.ID);

        Battleship battleshipOne = new Battleship();
        Battleship battleshipTwo = new Battleship();

        ProjectUtils.printMessage(battleshipOne.ID);
        ProjectUtils.printMessage(battleshipTwo.ID);
    }
}
