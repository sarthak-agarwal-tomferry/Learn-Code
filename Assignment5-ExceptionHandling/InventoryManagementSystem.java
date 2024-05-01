public class InventoryManagementSystem {
	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();

		try {
			productManager.addProduct(new Product(1, "ABC", 10.0, 2));
			productManager.addProduct(new Product(2, "XYZ", 50.20, 7));
			productManager.addProduct(new Product(3, "LMN", 30.10, 4));

			productManager.printProductList();

			productManager.addProduct(new Product(2, "HIJ", 90.40, 3)); // Exception

			productManager.updateProduct(3, 14.60, 8);
			productManager.printProductList();

			productManager.updateProduct(2, -50.40, 3); // Exception

			productManager.updateProduct(4, 90.40, 3); // Exception

			productManager.deleteProduct(2);
			productManager.printProductList();

			productManager.deleteProduct(4); // Exception

		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}