 // WORK IN PROGRESS

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
	
	
	paraUstu();
	
	
	
	
	}
	
	public static void paraUstu() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the bill amount in TL: ");
			int bill = sc.nextInt();
			System.out.print("Enter your payment amount in TL: ");
			int payment = sc.nextInt();
			System.out.print("Enter the tip amount in TL: ");
			int tip = sc.nextInt();
			int paraUstu = payment - bill - tip;
			int p200, p100, p50, p20, p10, p5, p1;
			
		if (payment + tip >= bill) {
			System.out.println("--------------------------------");
			System.out.println("Your change in TL: " + paraUstu);
			
			p200 = paraUstu/200;
			System.out.println("200: " + p200);
			paraUstu = paraUstu - p200*200;
			p100 = paraUstu/100;
			System.out.println("100: " + p100);
			paraUstu = paraUstu - p100*100;
			p50 = paraUstu/50;
			System.out.println("50: " + p50);
			paraUstu = paraUstu - p50*50;
			p20 = paraUstu/20;
			System.out.println("20: " + p20);
			paraUstu = paraUstu - p20*20;
			p10 = paraUstu/10;
			System.out.println("10: " + p10);
			paraUstu = paraUstu - p10*10;
			p5 = paraUstu/5;
			System.out.println("5: " + p5);
			paraUstu = paraUstu - p5*5;
			p1 = paraUstu/1;
			System.out.println("1: " + p1);
			paraUstu = paraUstu - p1*1;
		sc.close();
		}
		else if (payment == tip + bill) {
			System.out.println("We would like to thank you for your payment and state that we will"
					+ " be happy to host you again");
		}
		else  {
			System.out.println(Math.abs(paraUstu) + " is your underpayment amount");
		}
	}

}
