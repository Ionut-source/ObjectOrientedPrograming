package ro.ctrln.polymorphism;

import ro.ctrln.inheritance.*;
import ro.ctrln.util.ProjectUtils;

public class StarPortUsage {

    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy waiting to fly!");
        XWingStarFighter xWingStarFighter = new XWingStarFighter();
        xWingStarFighter.setStarshipDestination("Mars");
        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("Pluto");

        StarPort starPort = new StarPort();

        starPort.setStarship(falconHeavy);
        starPort.flyToSpace();
        ProjectUtils.printMessage(starPort);

        starPort.setStarship(xWingStarFighter);
        starPort.flyToSpace();
        ProjectUtils.printMessage(starPort);

        starPort.setStarship(tieFighter);
        starPort.flyToSpace();
        ProjectUtils.printMessage(starPort);

        // falconHeavy.setStarshipDestination("Mercury");
        starPort.setStarship(falconHeavy);
        // falconHeavy.setStarshipDestination("Mercury");
        starPort.flyToSpace();
        falconHeavy.setStarshipDestination("Mercury"); // obiectele se transmit mereu prin referinta -> respectiv locatia in memoria calculatorului
        ProjectUtils.printMessage(starPort);

        Starship starshipOne = new FalconHeavy();
        Starship starshipTwo = new XWingStarFighter();
        Starship starshipThree = new TieFighter();

        // Starship starshipFor = new Battleship();

        Battleship battleshipOne = new FalconHeavy();
        Battleship battleshipTwo = new ImperialStarDestroyer();

        // starPort.setStarship(battleshipOne); // eroare de compilare


        // FalconHeavy falconHeavyOne = new Battleship();  // nu pot face cast de la un obiect de tipul copil catre un obiect de tipul parinte

        starPort.setStarship(starshipOne);
        starPort.flyToSpace();
        ProjectUtils.printMessage(starPort);

        starPort.setStarship(starshipTwo);
        starPort.flyToSpace();
        ProjectUtils.printMessage(starPort);

        starPort.setStarship(starshipThree);
        starPort.flyToSpace();
        ProjectUtils.printMessage(starPort);

        ProjectUtils.printMessage(battleshipOne);
    }
}
