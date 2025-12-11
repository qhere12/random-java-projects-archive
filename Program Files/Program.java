import java.lang.reflect.Array;
import java.util.ArrayList;
import helloapagain31.ArrayManipulator;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

		public static void main(String[] args) {

			Student s1 = new Student("poyraz","eren",16,1.2);
			System.out.println(s1.toString());
		}	
			
		public static void paraUstu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hesap tutarınızı giriniz: ");
		int hesapTutarı = sc.nextInt();
		System.out.print("Vereceğiniz parayı giriniz: ");
		int para = sc.nextInt();
		int paraUstu = (para - hesapTutarı);
		int p200, p100, p50, p20, p10, p5, p1;
		
		System.out.println("Para Üstünüz: " + paraUstu);
		
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
		
		
		
		
		
			
			
	}
		public static void reverseOrder(String[] arr, int index) {
		
		if (index < 0) return;
		System.out.print(arr[index] + " ");		
		
		reverseOrder(arr , index - 1);
		}
		
		public static String matrixSums(int[][] matrix) {
			int evenSum = 0;
			int oddSum = 0;
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix.length; j++) {
					if(matrix[i][j] % 2 == 0) {
						evenSum += matrix[i][j];
					}else {
						oddSum += matrix[i][j];
					}
				}
			} return "Even Sum: " + evenSum + " | " + "Odd Sum: " + oddSum;
		}
		
		public static int[][] fillWithRandomNums(int range) {
			int[][] taskMatrix = new int[range][range];
			for(int i = 0; i < range; i++) {
				for(int j = 0; j < taskMatrix.length; j++) {
					taskMatrix[i][j] = (int) (Math.random()*(10 * 1 - 1))+ 1;
				}
			}return taskMatrix;
		}
		
		public static int diagonalSum(int[][] arr) {
			int sum = 0;
			for(int i = 0; i < arr.length; i ++) {
				sum += arr[i][i];
			}
			return sum;
		}
		
		public static void insertionSort(int[] arr) {
	    for (int i = 1; i < arr.length; i++) {  // Start from the second element
	        int key = arr[i]; // Element to be inserted

	        int j = i - 1;
	        // Move elements of arr[0..i-1] that are greater than key one position ahead

	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j--;
	        }
	        arr[j + 1] = key; // Insert key into its correct position
	    }
	}
	        
		public static void selectionSort(ArrayList<Integer> arr) {
			int n = arr.size();
			// assign arrays length to a variable

			for (int index = 0; index < n; index++) {
				int minimumIndex = index;

				//second loop
				for (int j = index + 1; j < n; j++) {

					if (arr.get(j) < arr.get(minimumIndex)) {
						minimumIndex = j;
				}
				  // Swap element
			}
	            int temp = arr.get(index);
	            arr.set(index, arr.get(minimumIndex));
	            arr.set(minimumIndex, temp);
			}
			
		}
		
		public static void selectionSort(int[] arr) {
		int n = arr.length;
		// assign arrays length to a variable

		for (int index = 0; index < n; index++) {
			int minimumIndex = index;

			//second loop
			for (int j = index + 1; j < n; j++) {

				if (arr[j] < arr[minimumIndex]) {
					minimumIndex = j;
			}
			  // Swap element
		}
            int temp = arr[index];
            arr[index] = arr[minimumIndex];
            arr[minimumIndex] = temp;

		}
		// {12,4,3,2,19,21,92,53}
	}
		public static int[] getRandomArray(int length) {
			int[] someArray = new int[length];
				int min = 1;
				int max = length;
		
			for (int i = 0; i < someArray.length; i++)	{
				int randomValue = (int) (Math.random()*(max * min - 1))+min;
				someArray[i] = randomValue;
			}
			return someArray;

		}		
			
		public static String removeSpaces(String text) {

			String anotherString = "";
			
				for (int i = 0; i <= text.length() -1; i++ ) {
					// if i TH index of sentence is not equal to space, add it to another string
					if (!(text.substring(i,i+1).equals(" "))) {
						anotherString += text.substring(i, i+1);
						
					}
				}
		return anotherString;
		
			
	}
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
			
		public static String capitalizeFirstAndLast(String fullname)	{
			
		
			int spaceIndex = fullname.indexOf(" ");
		
			String firstName = fullname.substring(0, 1).toUpperCase() +
						fullname.substring(1, spaceIndex);
			String lastName = fullname.substring(spaceIndex, (spaceIndex + 2)).toUpperCase() +
						fullname.substring((spaceIndex + 2));
		
			String capitalizedFirstAndLast = (firstName + lastName);
			return capitalizedFirstAndLast;
	}
	
		public static void alphabet()	{
			System.out.println("    A  B  C  D  E  F  G  H");
			System.out.println("--------------------------");
			
			for(int line = 1; line <= 9; line++) {
				System.out.print(line + " |");
				for(int j = 1; j < 9; j++) {
					
					System.out.print(" " + j + " ");
					
					
					
				}
				System.out.println();
				
			}
	}
	
		public static void john() {
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("Enter your name:");
				String name = scanner.next();
				
				System.out.print("Enter your age:");
				int age = scanner.nextInt();
				
				System.out.print("Enter your height:");
				double height = scanner.nextDouble();
				
				System.out.print("Hi! My name is \"" + name + 
						"\" I'm "+ age + " years old, "+ height+ 
						" meters tall, and I love coding! ");
				scanner.close();
			
		
	}

		public static void mathopconsole() {
		
		
		Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome to the Math Operations Console!");
	
	System.out.print("Enter an integer number: ");
	int y = scanner.nextInt();
	
	System.out.print("Enter a double number: ");
	double x = scanner.nextDouble();
	
	System.out.println("Sum: "+ (y + x));
	System.out.println("Difference: "+ (y - x));
	System.out.println("Product: "+ (y * x));
	System.out.println("Quotient: "+ (y / x));
	System.out.println("Modulus: "+ (y % x));
	scanner.close();
	
	}
		
		public static void discount() {
			
			Scanner scanner = new Scanner(System.in);
			
			double price = 1000;
			double discount;
			System.out.print("Input your discount persentage: ");
		
			discount = scanner.nextDouble();
			
			price = price - price * (0.01 * discount);
			System.out.print("Your discounted price: "+ price);
			scanner.close();

		
	}

	
}
