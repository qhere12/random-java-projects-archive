public static void main(String []args) {

public static void v1 () {
			User user1 = new User(31.1);
			
			Item item1 = new Item("M&M", 10, 7.54);

			Item item2 = new Item("Ice-cream", 5, 10.23);

			Item item3 = new Item("Water", 5, 2.32);

			Item item4 = new Item("Ice tea", 10, 2.54);

			Item item5 = new Item("Chocolate", 0, 6.24);
			
			Item[] itemArray = {item1,item2,item3,item4,item5};


			VendingMachine machine1 = new VendingMachine(itemArray);
			
				machine1.operate(user1);
			
				
		}
}
