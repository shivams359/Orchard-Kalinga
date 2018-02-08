import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int age,weight;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your age:");
		age= scan.nextInt();
		System.out.println("enter your weight");
		weight= scan.nextInt();
		ThrowException throwException = new ThrowException();
		throwException.ThrowException(age, weight);

	}

}
