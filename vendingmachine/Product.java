package vendingmachine;

public enum Product {
    CHOCOLATE(1,50,20), COKE(2, 80,40), WATER(3,100,50), SANDWITCH(4,150,20);

    private int id;
    private int price;
    private int count;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
    public int getCount(){
        return count;
    }

    private Product(int id, int price, int count) {
        this.id = id;
        this.price = price;
        this.count = count;
    }

    public static Product getProductById(int id){
        for(Product product: Product.values()){
            if(product.id == id){
                return product;
            }
        }
        return null;
    }
}
