package ro.ctrln.inheritance;

public class ImperialStarDestroyer extends Battleship{

    private int numberOfDecks;

    public int getNumberOfDecks(){
        return numberOfDecks;
    }

    public void setNumberOfDecks(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    @Override
    public String toString() {
        return "ImperialStarDestroyer{" +
                "numberOfDecks=" + numberOfDecks +
                ", battershipName=" + getBattleshipName() +
                ", battershipCapacity=" + getBattleshipCapacity() +
                '}';
    }
}
