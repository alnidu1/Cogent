package inheritance;

public class Publication {
	private double price;
	private String title;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price <= 0) {
			System.out.println("Invalid price");
		}
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	void sell(int qty) {
		
		System.out.println( this.price* qty);
	}
		
}
