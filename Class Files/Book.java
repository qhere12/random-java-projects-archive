package helloapagain31;


public class Book {

	private String name;
	private String author;
	private double price;
	public Book(String bookName, String bookAuthor, double bookPrice) {
		this.name = capitalizeFirstAndLast(bookName);
		this.author = capitalizeFirstAndLast(bookAuthor);
		this.price = bookPrice;
		
		
		System.out.println("New book created: " + name + " by " + author);
		
		
		
	}
	
		private String capitalizeFirstAndLast(String temp) {
		int spaceIndex = temp.indexOf(" ");
		
		String firstName = temp.substring(0, 1).toUpperCase() +
				temp.substring(1, spaceIndex);
		String lastName = temp.substring(spaceIndex, (spaceIndex + 2)).toUpperCase() +
				temp.substring((spaceIndex + 2));
	
		String capitalizedFirstAndLast = (firstName + lastName);
		return capitalizedFirstAndLast;
	}

		public void bookNameAndAuthor() {
		System.out.print("Book Name: " + name + ", " + "Author: " + author);
		
	}
	
		public void applyDiscount(double discountRate) {
	
		price = price - price * (0.01 * discountRate);
		System.out.print("Your discounted price: "+ price);
		
	}
	
	
		public double getPrice () {
		return price;
	}
			
			public double discountTest(double discountRate) {
				return price - price * (0.01 * discountRate);
			}

			
}