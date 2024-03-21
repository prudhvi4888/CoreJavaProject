package CoreJavaPracticeInterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CiscoInterview {

	public static void main(String[] args) {

		int[][] numbers = { { 4, 6, 7 }, { 5, 9, 10 }, { 12, 22, 99 } };

		int min = numbers[0][0];
		int mincolumn = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (numbers[i][j] < min) {
					min = numbers[i][j];
					mincolumn = j;

				}

			}

		}
		System.out.println(mincolumn);
		int maxnumber = numbers[0][mincolumn];
		int k = 0;
		while (k < 3) {

			if (numbers[k][mincolumn] > maxnumber) {
				maxnumber = numbers[k][mincolumn];
			}
			k++;
		}
		System.out.println(maxnumber);
	
	
	LocalDateTime currentDateTime = LocalDateTime.now();

    // Format the date and time using a DateTimeFormatter
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    String formattedDateTime = currentDateTime.format(formatter);

    // Print the current date and time
    System.out.println("Current Date and Time: " + formattedDateTime);
    
	}}
