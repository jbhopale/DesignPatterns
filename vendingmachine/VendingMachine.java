package vendingmachine;

public interface VendingMachine {
    public void displayProducts();
    public void selectProduct(int product);
    public void displayEnterCoinsMsg();
    public void enterCoins(int... coins);
    public void displayChangeMsg();
}
