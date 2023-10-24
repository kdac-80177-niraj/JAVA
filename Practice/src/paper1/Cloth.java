/*package paper1;

import java.sql.Date;

enum Size{
	S,M,L,XL
}

public class Cloth {
	private static int idCounter = 1;
	private int id;
	private Date listingDate;
	private Date stockUpdateDate;
	private int stock;
	private Size size;
	private double price;
	public Cloth() {
		super();
	}
	public Cloth(Date listingDate,int stock, Size size, double price) {
		super();
		this.id = idCounter;
		this.listingDate = listingDate;
		this.stockUpdateDate = new Date();
		this.stock = stock;
		this.size = size;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getListingDate() {
		return listingDate;
	}
	public void setListingDate(Date listingDate) {
		this.listingDate = listingDate;
	}
	public Date getStockUpdateDate() {
		return stockUpdateDate;
	}
	public void setStockUpdateDate(Date stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
		this.stockUpdateDate = new Date();
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cloth [id=" + id + ", listingDate=" + listingDate + ", stockUpdateDate=" + stockUpdateDate + ", stock="
				+ stock + ", size=" + size + ", price=" + price + "]";
	}
	
	
	
	
}*/
