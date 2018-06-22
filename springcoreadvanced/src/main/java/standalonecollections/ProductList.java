package standalonecollections;

import java.util.List;

public class ProductList {

	List<String> productname;

	public List<String> getProductname() {
		return productname;
	}

	@Override
	public String toString() {
		return "ProductList [productname=" + productname + "]";
	}

	public void setProductname(List<String> productname) {
		this.productname = productname;
	}

}
