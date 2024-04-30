import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	private List<Product> productList;

	public ProductManager() {
		productList = new ArrayList<Product>();
	}

	public void addProduct(Product newProduct) throws DuplicateProductException {
		for (Product product : productList) {
			if (product.getId() == newProduct.getId()) {
				throw new DuplicateProductException("Product already exist Id - " + newProduct.getId());
			}
		}
		productList.add(newProduct);
	}

	public void updateProduct(int id, Double price, Integer quantity)
			throws InvalidDataException, ProductNotFoundException {
		for (Product product : productList) {
			if (product.getId() == id) {
				if (price < 0 || quantity < 0) {
					throw new InvalidDataException("Price and Quantity can't be negative.");
				}
				product.setPrice(price);
				product.setQuantity(quantity);
				return;
			}
		}
		throw new ProductNotFoundException("Product not found with Id : " + id);
	}

	public void deleteProduct(int id) throws ProductNotFoundException {
		for (Product product : productList) {
			if (product.getId() == id) {
				productList.remove(product);
				return;
			}
		}
		throw new ProductNotFoundException("Product not found with Id : " + id);
	}

	public void printProductList() {
		for (Product product : productList) {
			System.out.println("Product #" + product.getId() + " " + product.getName() + " " + product.getPrice() + " "
					+ product.getQuantity());
		}
	}
}