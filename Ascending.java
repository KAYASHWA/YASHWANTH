package p12;

public class Ascending {
	public static void main(String[] args) {
		int[] intArr = new int[] { 52, 45, 32, 64, 12, 87, 78, 98, 23, 7 };
		int temp = 0;

		System.out.println("Original array: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}

		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] > intArr[j]) { 
					temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}

		System.out.println("\nArray sorted in ascending order: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr [i] + " ");
		}
	}
}