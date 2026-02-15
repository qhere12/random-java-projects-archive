import java.util.Scanner;
import java.util.ArrayList;

public class Canteen {

	ArrayList<String> names = new ArrayList();
	ArrayList<Integer> prices = new ArrayList();
	ArrayList<Integer> stocks = new ArrayList();
	
	Item item1 = new Item(null, 0, 0);
	Item item2 = new Item(null, 0, 0);
	Item item3 = new Item(null, 0, 0);
	Item item4 = new Item(null, 0, 0);
	Item item5 = new Item(null, 0, 0);
	int total = 0;
	
	public Canteen() {
		Scanner sc = new Scanner(System.in);
		int counter1 = 1;
		int counter2 = 0;
		int counter3 = 0;

		System.out.println("Enter 5 product names...");
		while (counter1 <= 5) {
			System.out.print(counter1 + ". Product name: ");
			names.add(sc.next());
			counter1++;
		}
		System.out.println("Enter the unit prices of the products...");
		while (counter2 < 5) {
			System.out.print(names.get(counter2) + " price: ");
			prices.add(sc.nextInt());
			counter2++;
		}
		System.out.println("Enter the starting stock of the products...");
		while (counter3 < 5) {
			System.out.print(names.get(counter3) + " stock: ");
			stocks.add(sc.nextInt());
			counter3++;
		}
		item1.setName(names.get(0)); item1.setPrice(prices.get(0)); item1.setStock(stocks.get(0));
		item2.setName(names.get(1)); item2.setPrice(prices.get(1)); item2.setStock(stocks.get(1));
		item3.setName(names.get(2)); item3.setPrice(prices.get(2)); item3.setStock(stocks.get(2));
		item4.setName(names.get(3)); item4.setPrice(prices.get(3)); item4.setStock(stocks.get(3));
		item5.setName(names.get(4)); item5.setPrice(prices.get(4)); item5.setStock(stocks.get(4));
			weekCycle();
		
	}
		private void dayCycle(int dayNum) {
			Scanner s = new Scanner(System.in);
		int dayTotal = 0;
			System.out.println("Day " + dayNum + " Sales Entry");
				System.out.print(item1.getName() + ": ");
				int i1soldQ = s.nextInt();
			if(i1soldQ > item1.getStock()) System.out.println("insufficent stock!");
			else {
				dayTotal += i1soldQ * item1.getPrice();
				item1.setStock(item1.getStock() - i1soldQ);
					System.out.println("Quantity sold: " + i1soldQ);
					System.out.println(">>>Total Revenue: " + dayTotal);
					
					System.out.print(item2.getName() + ": ");			
					int i2soldQ = s.nextInt();
				if(i2soldQ > item2.getStock()) System.out.println("insufficent stock!");
				else {
					dayTotal += i2soldQ * item2.getPrice();
					item2.setStock(item2.getStock() - i2soldQ);
						System.out.println("Quantity sold: " + i2soldQ);
						System.out.println(">>>Total Revenue: " + dayTotal);
						System.out.print(item3.getName() + ": ");
						int i3soldQ = s.nextInt();
					if(i3soldQ > item3.getStock()) System.out.println("insufficent stock!");
					else {
						dayTotal += i3soldQ * item3.getPrice();
						item3.setStock(item3.getStock() - i3soldQ);
							System.out.println("Quantity sold: " + i3soldQ);
							System.out.println(">>>Total Revenue: " + dayTotal);
							System.out.print(item4.getName() + ": ");
							int i4soldQ = s.nextInt();
						if(i4soldQ > item4.getStock()) System.out.println("insufficent stock!");
						else {
							dayTotal += i4soldQ * item4.getPrice();
							item4.setStock(item4.getStock() - i4soldQ);
								System.out.println("Quantity sold: " + i4soldQ);
								System.out.println(">>>Total Revenue: " + dayTotal);
								System.out.print(item5.getName() + ": ");
								int i5soldQ = s.nextInt();
							if(i5soldQ > item5.getStock()) System.out.println("insufficent stock!");
							else {
								dayTotal += i5soldQ * item5.getPrice();
								item5.setStock(item5.getStock() - i5soldQ);
									System.out.println("Quantity sold: " + i5soldQ);
									System.out.println(">>>Total Revenue: " + dayTotal);
									
									System.out.println("<<<Day " + dayNum + " Sales Summary>>>");
									System.out.println(item1.getName() + ": " + i1soldQ + " units sold");
									System.out.println(item2.getName() + ": " + i2soldQ + " units sold");
									System.out.println(item3.getName() + ": " + i3soldQ + " units sold");
									System.out.println(item4.getName() + ": " + i4soldQ + " units sold");
									System.out.println(item5.getName() + ": " + i5soldQ + " units sold");
										System.out.println(" ");
										System.out.println("End of Day Stock Report");
								System.out.print(item1.getName() + ": ");	stars(item1);
								System.out.println("");
								System.out.print(item2.getName() + ": ");	stars(item2);
								System.out.println("");
								System.out.print(item3.getName() + ": ");	stars(item3);
								System.out.println("");
								System.out.print(item4.getName() + ": ");	stars(item4);
								System.out.println("");
								System.out.print(item5.getName() + ": ");	stars(item5);
								System.out.println("");
										
									System.out.println("Message:");
									System.out.println("Have a good night!");
									System.out.println(" ");
									total += dayTotal;
					}
				}
			}	
		}	
	}	
}
	
		

		private void stars(Item it) {
			
			for(int i = 0; i < it.getStock(); i++) {
				System.out.print("*");
			}
		}
		
		private void weekCycle() {
			dayCycle(1);
			dayCycle(2);
			dayCycle(3);
			dayCycle(4);
			dayCycle(5);
			
		System.out.println("END OF 5 DAYS CANTEEN STATUS");
		System.out.println("         STOCK");
		System.out.print(item1.getName() + ": ");	stars(item1);
		System.out.println("");
		System.out.print(item2.getName() + ": ");	stars(item2);
		System.out.println("");
		System.out.print(item3.getName() + ": ");	stars(item3);
		System.out.println("");
		System.out.print(item4.getName() + ": ");	stars(item4);
		System.out.println("");
		System.out.print(item5.getName() + ": ");	stars(item5);
		
			System.out.println("");
			System.out.println("     TOTAL REVENUE");
			System.out.println("         " + total);
		
		
		
		
		}
}
