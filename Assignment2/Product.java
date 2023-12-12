class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;

    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int quantity) {
        this.productQuantity = quantity;
    }
}