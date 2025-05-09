package Com.Example;

public class ProductMain {
	public static void main(String[] args) {
		Product product = new Product();
		product.setProductDetails("Laptop", 501, 75000.0);
		String res = product.getProductDetails();
		System.out.println(res);
	}
}
