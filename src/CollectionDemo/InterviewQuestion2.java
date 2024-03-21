package CollectionDemo;

import java.util.ArrayList;

public class InterviewQuestion2 {

	public static void main(String[] args) {

		int numbers[] = { 3, 5, 5, 5, 6, 6, 9, 4, 4 };

		ArrayList<Integer> allNumbers = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			int k = 0;

			if (!allNumbers.contains(numbers[i])) {

				allNumbers.add(numbers[i]);
				k++;
				for (int j = i + 1; j < numbers.length; j++) {
					if (numbers[i] == numbers[j]) {
						k++;

					}

				}
				System.out.println(numbers[i] + " is present" + k + " times");

			}

		}

	}

}
