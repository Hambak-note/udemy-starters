package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		//traditional programming approach
		printAllNumbersInListStructurerd(List.of(12, 9, 13, 4, 6, 2, 4,12,15));
		

	}

	private static void printAllNumbersInListStructurerd(List<Integer> numbers) {
		//How to loop the numbers?
		for(int number:numbers) {
			System.out.println(number);
		}
	}

}
