package vendingmachine;

public class CoinBundle {
    public int numOf5CentsCOins;
    public int numOf10CentsCOins;
    public int numOf20CentsCOins;
    public int numOf50CentsCOins;
    public int numOf100CentsCOins;
    
    public CoinBundle(int... enteredCoins) {
        this.numOf5CentsCOins = enteredCoins[0];
        this.numOf10CentsCOins = enteredCoins[1];
        this.numOf20CentsCOins = enteredCoins[2];
        this.numOf50CentsCOins = enteredCoins[3];
        this.numOf100CentsCOins = enteredCoins[4];
    }
    public int getTotal(){
        return -1;
    }
}
