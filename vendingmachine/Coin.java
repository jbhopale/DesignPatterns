package vendingmachine;

public enum Coin {
    FIVE_CENTS(5), TEN_CENTS(10), TWENTY_CENTS(20), FIXTY_CENTS(50), HUNDRED_CENTS(100);

    private int value;
    
    public int getValue() {
        return value;
    }

    private Coin(int value){
        this.value =  value;
    }
}
