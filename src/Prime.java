import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		Integer r = 0;
		Scanner scan = new Scanner(System.in);

<<<<<<< HEAD
		System.out.println("Enter an num:");
=======
		System.out.println("Hey, Enter an num:");
>>>>>>> seo_title
		a = scan.nextInt();

		if (a < 1) {
			System.out.println("Are you kidding me :D");
		} else if (a == 1) {
			System.out.println("Number is prime");
		} else {
			b = a - 1;
			boolean isNumberPrime = true;
			while (b > 1) {
				r = a % b;
				if (r == 0) {
					isNumberPrime = false;
					break;
				}
				b--;
			}
			if (isNumberPrime) {
				System.out.println("Number is prime");
			} else {
				System.out.println("Number is not prime at all you idiot");
			}
		}

	}
}
