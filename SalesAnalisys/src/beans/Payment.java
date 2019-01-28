package beans;

public abstract class Payment {
	
	private MyDate transactionDate;
	private Product product;
	private double price;
	private String type;
	private String name;
	private Location location;
	
	
	public String toString() {
		return transactionDate.toString() + "," + 
			   product.getProductName() + "," + 
			   price + "," + 
			   type + "," + 
			   name + "," + 
			   location.toString();
	}
	
	
	
	public MyDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(MyDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	

}
