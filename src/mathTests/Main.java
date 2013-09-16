package mathTests;

import java.math.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Test test = new Test();
		Scanner scanner = new Scanner(System.in);
		String input;
		while (true) {
			System.out
					.println("Choose Test: \n 1. Communitive \n 2. Associative \n 3. Quit");
			input = scanner.nextLine();
			if (input.equals("1")) {
				test.commu();
				break;
			} else if (input.equals("2")) {
				test.asso();
				System.out.println("Feature Not Implemented");
			} else if (input.equals("3")) {
				System.out.println("Bye");
				break;
			} else {
				System.out.println("Invalid Responce");
			}
		}// loop ends
	}
}
