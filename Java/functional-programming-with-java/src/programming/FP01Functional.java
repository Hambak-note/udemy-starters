package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		//traditional programming approach
		printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4,12,15));
		

	}
	
	private static void print(int number) {
		System.out.println(number);
	}
	

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//[12, 9, 13, 4, 6, 2, 4,12,15]
		//12
		//9
		//13
		//...
		
	
		//What to do?
		numbers.stream()
			.forEach(FP01Functional::print);
	}
}
