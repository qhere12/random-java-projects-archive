package helloapagain31;

import java.util.Scanner;

public class VendingMachine {


private User user1;

private	Item[] items;


		public VendingMachine(Item[] items) {
			this.items = items;
}


// 1) Name Stock Price


public void showSnacks() {

	System.out.println("---------------------------------");
// System.out.println("1) " +  item1.toText());

	int counter = 1;
	for(Item element : this.items) {
	System.out.println(counter + ") " + element.toText());
	counter++;
	}
	
	
	System.out.println("---------------------------------");

}
public void budget () {
	System.out.print(user1.budget);
}



public void operate(User user) {
	boolean isRunning = true;
	while(isRunning) {
	showSnacks();
		System.out.println("ENTER THE ITEM NUMBER WHICH YOU WANT TO BUY: ");

	Scanner scanner = new Scanner(System.in);

	int selection = scanner.nextInt();
	selection--;
	if(selection < 0 || selection > this.items.length -1) {
		System.out.println("THE ITEM BY THAT NUMBER DOES NOT EXIST!");
		System.out.print("TRY AGAIN? Y/N : ");
		String again1 = scanner.next();
		isRunning = false;
		if (again1.equals("Y")) {
			System.out.println("RUNNING PROGRAM AGAIN...");
			
		}else {
			System.out.println("TERMINATING PROGRAM...");
			isRunning = false;
		}}else {
		this.buy(user, this.items[selection]);
	}
	}

}	
public void buy(User currentUser, Item whichItem) {
	Scanner scanner = new Scanner(System.in);
	
	boolean isRunning = true;
	while(isRunning) {
		if (whichItem.stock > 0 && currentUser.budget >= whichItem.price) {
			currentUser.budget = currentUser.budget - whichItem.price;
			whichItem.stock--;
			System.out.println("BOUGHT ITEM. REMAINING BALANCE:" + currentUser.budget);
			System.out.println("RUNNING PROGRAM AGAIN...");
			isRunning = false;
		}else if (whichItem.stock == 0) {
			System.out.println("INSUFFICENT STOCK");
			System.out.print("TRY AGAIN? Y/N : ");
			String again1 = scanner.next();
			isRunning = false;
			if (again1.equals("Y")) {
				System.out.println("RUNNING PROGRAM AGAIN...");
				isRunning = true;
			}else {
				System.out.println("TERMINATING PROGRAM...");
				isRunning = false;
			}
		}else {
			System.out.println("INSUFFICENT BALANCE");
			System.out.print("TRY AGAIN? Y/N : ");
			String again1 = scanner.next();
			isRunning = false;
			if (again1.equals("Y")) {
				System.out.println("RUNNING PROGRAM AGAIN...");
				isRunning = true;
			}else {
				System.out.println("TERMINATING PROGRAM...");
				isRunning = false;
			}
		}
		}
		


}	
}





