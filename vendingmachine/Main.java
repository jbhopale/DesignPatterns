package vendingmachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine vendingMachine = new TextBasedVendingMachine();
        vendingMachine.displayProducts();
        int selectedProduct = sc.nextInt();
        vendingMachine.selectProduct(selectedProduct);
        vendingMachine.displayEnterCoinsMsg();
        String enteredCoin = sc.nextLine();
        int[] coins = {};
        vendingMachine.enterCoins(coins);
        vendingMachine.displayChangeMsg();
    }
}
