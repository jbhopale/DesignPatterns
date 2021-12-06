package vendingmachine;

public class TextBasedVendingMachine implements VendingMachine{
    private int selectedProduct;
    private CoinBundle change;
    @Override
    public void displayProducts() {
        System.out.println("****************************************");
        System.out.println("*********** VENDING MACHINE ************");
        System.out.println("****************************************");
        
        for(Product product: Product.values()){
            System.out.println(product.getId()+" "+product.name()+" Price :"+product.getPrice());
        }

        System.out.println("Select item from the machine: ");
    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;     
        System.out.println("Selected product is: "+Product.getProductById(product));
        System.out.println("Your total is: " +Product.getProductById(product).getPrice());   
    }

    @Override
    public void displayEnterCoinsMsg() {
        System.out.println("****************************************");
        System.out.println("**** ENTER NUMBER OF COINS IN SQEUENCE *****");
        System.out.println("5 cents : 10 cents : 20 cents : 50 cents : 100 cents");
    }

    @Override
    public void enterCoins(int... coins) {
        Calculator calculator = null;
        Product selectedProduct = Product.getProductById(this.selectedProduct);    
        int total = calculator.calculatedTotal(new CoinBundle(coins));
        int changeAmount = total - selectedProduct.getPrice();
        this.change = calculator.calculateChange(changeAmount);
    }

    @Override
    public void displayChangeMsg() {
        System.out.println("Your change amount is "+ change.getTotal()+" cents");
        
    }
    
}
