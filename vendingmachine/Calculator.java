package vendingmachine;

public interface Calculator {
    public int calculatedTotal(CoinBundle enteredCoins);
    public CoinBundle calculateChange(int amountToReturn);
}
