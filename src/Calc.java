import java.util.Scanner;

//In the name of Allah
public class Calc {

	public static void main(String[] args) {

		Integer IntegerNum1 = 0.0;
		Integer IntegerNum2 = 0.0;
		Integer Sum = 0.0;
		Integer Sbt = 0.0;
		String Str = "Hello! This program will help you to sum or subtraction two number";

		System.out.println(Str);
		System.out.println("Please Enter First Number");

		Scanner sc1 = new Scanner(System.in);
		IntegerNum1 = sc1.nextInteger();

		System.out.println("Great, Now Enter Second Number");

		Scanner sc2 = new Scanner(System.in);
		IntegerNum2 = sc2.nextInteger();

		Sum = IntegerNum1 + IntegerNum2;
		Sbt = IntegerNum1 - IntegerNum2;

		System.out.println("Summation=" + Sum);
		System.out.println("Subtraction=" + Sbt);

	}
}
