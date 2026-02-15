public class Item {
	 
	private int stock;
	private String name;
	private int price;
	
	public Item(String n, int s, int p) {
		this.name = n;
		this.stock = s;
		this.price = p;
		
	}
	
	public int getPrice() {
		return this.price;
	}

	public String getName() {
		return this.name;
	}

	public int getStock() {
		return this.stock;
	}
	
	public void setPrice(int pr) {
		this.price = pr;
	}

	public void setName(String n) {
		 this.name = n;
	}

	public void setStock(int st) {
		 this.stock = st;
	}
	
	public void getStats() {
		System.out.println(this.name + " " + this.stock + " " + this.price);
	}

}
