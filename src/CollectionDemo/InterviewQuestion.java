package CollectionDemo;

import java.util.ArrayList;

public class InterviewQuestion {

	public static void main(String[] args) {

		int numbers[] = { 3, 5, 5, 5, 6, 6, 9, 4, 4 };

		ArrayList<Integer> allNumbers = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {

			if (!allNumbers.contains(numbers[i])) {

				allNumbers.add(numbers[i]);
			}

		}
		for (int i = 0; i < allNumbers.size(); i++) {

			if (allNumbers.get(i) % 2 == 0) {
				even.add(allNumbers.get(i));

			} else {

				odd.add(allNumbers.get(i));
			}

		}

		System.out.println("The even numbers are "+even);
		System.out.println("The odd numbers are "+odd);
	}

}
