
//Gabe Lanz

import java.util.Scanner;
import java.util.Random;

public class RandomNumbersLanz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean control = false;
		Random rand = new Random();

		while (!control) {
			System.out.print("How many Random numbers would you like to see? Enter '0' to quit; ");
			if (in.hasNextInt()) {
				int userSelection = in.nextInt();

				if (userSelection == 0) {
					System.out.println("Thank you! Have a nice day!");
					control = true;
				} else {

					System.out.print("What is the lowest number of the range that you'd like to see? ");

					int lowest = in.nextInt();

					System.out.print("What is the highest number of the range, that you'd like to see? ");

					int highest = in.nextInt();

					int randomPick = highest - lowest + 1;

					int finalRandom = rand.nextInt(randomPick) + lowest;
					for (int i = 0; i < userSelection; i++) {
						System.out.println(rand.nextInt(finalRandom));
					}

				}
			}
		}
		in.close();
	}
}
