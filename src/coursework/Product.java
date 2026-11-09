package coursework;

public class Product {


	private String productId;
	private String productName;
	private String productCategory;
	private double unitPrice;
	private int quantityInStock;

	public Product( String productId, String productName, String productCategory,
	 double unitPrice, int quantityInStock) {
		 setProductId(productId);
		  setProductName(productName);
		  setProductCategory(productCategory);
		  setUnitPrice(unitPrice);
		  setQuantityInStock(quantityInStock);
	}
	public String getProductId() {
	return productId;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	
	public void setProductId(String productId) {
		if(productId==null) {
			System.out.println("Error:product Id must be filled!");
		}else {
			this.productId = productId;
		}
	}
	public void setProductName(String productName) {
		if(productName==null) {
			System.out.println("Error:product Name must be filled!");
		}else {
			this.productName = productName;
		}
	}
	public void setProductCategory(String productCategory) {
		if(productCategory==null) {
			System.out.println("Error:product Category must be filled!");
		}else {
			this.productCategory = productCategory;
		}
	}
	
	
	public void setUnitPrice(double unitPrice) {
		if(unitPrice<0) {
			System.out.println("Error:price cannot be negative.");
		}else {
			this.unitPrice = unitPrice;
		}
	}
	public void setQuantityInStock(int quantityInStock) {
		if(quantityInStock<0) {
			System.out.println("Error:quantity in stock cannot be negative.");
		}else {
			this.quantityInStock= quantityInStock;
		}
	}
	
	
	
}

