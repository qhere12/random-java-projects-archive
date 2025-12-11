
public class ArrayManipulator {

	public static String arrayToString(String[] array) {
		String modded = "[\"";
		for(String element : array) {
			modded +=  element + "\", \"";
		}
		return modded.substring(0, (modded.length() -3 )) + "]";
	}
	
	public static String arrayToString(int[] array) {
		String modded = "[\"";
		for(int element : array) {
			modded +=  element + "\", \"";
		}
		return modded.substring(0, (modded.length() -3 )) + "]";
	}
	public static String arrayToString(double[] array) {
		String modded = "[\"";
		for(double element : array) {
			modded +=  element + "\", \"";
		}
		return modded.substring(0, (modded.length() -3 )) + "]";
	}
	public static int getMax(int[] array) {
		int max = Integer.MIN_VALUE;
		for(int number : array) {
			if(number > max) {
				max = number;
			}
		}
		return max;
	}
	public static int getMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int number : array) {
			if(min > number) {
				min = number;
			}
		}
		return min;
	}
	public static String occurance(int[] array , int value) {
		int occuranceCounter = 0;
		for(int elements : array) {
			if(elements == value) {
				occuranceCounter++;
			}else {
				continue;
			}
		}
		return "ELEMENT " + value + " HAS OCCURED " + occuranceCounter + " TIME(S).";
	}
	public static String sum(int[] array) {
		int sum = 0;
		for(int elements : array) {
			sum += elements;
		}
		return "SUM: " + sum;
	}
}
