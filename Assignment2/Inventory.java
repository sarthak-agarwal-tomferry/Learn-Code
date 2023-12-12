class Inventory {
    private List<Product> productList;

    public Inventory() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProducts() {
        return productList;
    }
}