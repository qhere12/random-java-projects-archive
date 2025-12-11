import java.util.Scanner;

public class VendingMachineOutdated {

	int mnmPrice = 5;
	int biskremPrice = 15;
	int metroPrice = 10;
	int waterPrice = 5;
	int iceteaPrice = 20;

	
	public VendingMachineOutdated () {
		System.out.println("Welcome to the wending machine! ");
		System.out.println("Available items: 1) M&M 5tl, 2) Biskrem 15tl, 3) Metro 10tl, 4) Water 5tl, 5) Ice Tea 20tl,");
		
	}
		
	public void buyItem (String itemName) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your budget: ");
		int budget = sc.nextInt();
		if (itemName == "M&M") {
			if (budget >= mnmPrice) {
				System.out.println("Successfully bought item!");
		}else {
			System.out.println("Not enough budget!");	
		}
	}else if (itemName == "Biskrem") {
		if (budget >= biskremPrice) {
			System.out.println("Successfully bought item!");
		}else {
			System.out.println("Not enough budget!");
		}
	}else if (itemName == "Metro") {
		if (budget >= metroPrice) {
			System.out.println("Successfully bought item!");
		}else {
			System.out.println("Not enough budget!");
		}
	}else if (itemName == "Water") {
		if (budget >= waterPrice) {
			System.out.println("Successfully bought item!");
		}else {
			System.out.println("Not enough budget!");
		}
	}else if (itemName == "Ice Tea") {
		if (budget >= iceteaPrice) {
			System.out.println("Successfully bought item!");
		}else {
			System.out.println("Not enough budget!");
		}
	}else {
		System.out.println("Pleas enter a valid item name!");
	} sc.close();
	}	
}

