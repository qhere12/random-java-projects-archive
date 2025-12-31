import java.util.Scanner;

import [PACKAGE_NAME].ArrayManipulator;


public class ArrayCreator {
	private int [] intarray;
	private String[] stringarray;
	private double[] doublearray;
	
	public ArrayCreator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO ARRAY CREATOR! CHOOSE AN ARRAY TYPE YOU WANT TO CREATE...");
		System.out.println(" | 1 | INTEGER ARRAY...");
		System.out.println(" | 2 | STRING ARRAY...");
		System.out.println(" | 3 | DOUBLE ARRAY...");
		System.out.println("SELECTION: ");
		int selection = sc.nextInt();
		ArrayCreator.select(selection);
		
	}
	public static void select(int selection) {
		if(selection == 1) {
			System.out.println("INTEGER ARRAY SELECTED. STARTING CREATION PROSEDURES...");
			ArrayCreator.intArrayCreate();
		}else if (selection == 2) {
			System.out.println("STRING ARRAY SELECTED. STARTING CREATION PROSEDURES...");
			ArrayCreator.stringArrayCreate();
		}else if (selection == 3) {
			System.out.println("DOUBLE ARRAY SELECTED. STARTING CREATION PROSEDURES...");
			ArrayCreator.doubleArrayCreate();
		}else {
			System.out.println("ENTER A VALID NUMBER!");
			
		}
	}
	public static void intArrayCreate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO INTEGER ARRAY CREATOR! MAX ELEMENT LIMIT = 15");
		System.out.println("ENTER ELEMENT: ");
		int[] intArray = new int[15];
		for(int i = 0; i < intArray.length; i++) {
			int element = sc.nextInt();
			System.out.println("ADDED " + element + " ENTER A NEW ELEMENT: ");
			intArray[i] = element;
		boolean arrayIsFull = (intArray[14] != 0);
			if(arrayIsFull) {
			System.out.println("SUCCESS! CREATED DESIRED ARRAY...");
			System.out.println("PRINTING YOUR ARRAY...");
			System.out.println(ArrayManipulator.arrayToString(intArray));
		}
	} 
		
	}
	public static void stringArrayCreate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO STRING ARRAY CREATOR! MAX ELEMENT LIMIT = 15");
		System.out.println("ENTER ELEMENT: ");
		String[] strArray = new String[15];
		for(int i = 0; i < strArray.length; i++) {
			String element = sc.next();
			System.out.println("ADDED " + element + " ENTER A NEW ELEMENT: ");
			strArray[i] = element;
		boolean arrayIsFull = (strArray[14] != null);
			if(arrayIsFull) {
			System.out.println("SUCCESS! CREATED DESIRED ARRAY...");
			System.out.println("PRINTING YOUR ARRAY...");
			System.out.println(ArrayManipulator.arrayToString(strArray));
		}
	} 
		
	}
	public static void doubleArrayCreate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO INTEGER ARRAY CREATOR! MAX ELEMENT LIMIT = 15");
		System.out.println("ENTER ELEMENT: ");
		double[] doubleArray = new double[15];
		for(int i = 0; i < doubleArray.length; i++) {
			double element = sc.nextDouble();
			System.out.println("ADDED " + element + " ENTER A NEW ELEMENT: ");
			doubleArray[i] = element;
		boolean arrayIsFull = (doubleArray[14] != 0.0);
			if(arrayIsFull) {
			System.out.println("SUCCESS! CREATED DESIRED ARRAY...");
			System.out.println("PRINTING YOUR ARRAY...");
			System.out.println(ArrayManipulator.arrayToString(doubleArray));
		}
	} 
	}
}
