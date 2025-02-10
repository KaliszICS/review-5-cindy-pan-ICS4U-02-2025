import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num;
		num = in.nextDouble();
		in.nextLine();
		System.out.print(Math.abs(num));
		System.out.println();
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double numOne = in.nextDouble();
		System.out.print("Input another number: ");
		double numTwo =  in.nextDouble();
		double ans = (numOne/numTwo);
		System.out.print(Math.floor(ans) +"\n"+ Math.ceil(ans));
		System.out.println();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int next = in.nextInt();
		double again = (Math.sqrt(next));
		System.out.print(Math.round(again));
		System.out.println();

	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double number = in.nextDouble();
		System.out.print("Input another number: ");
		double numberOne = in.nextDouble();
		System.out.print(Math.pow(number,numberOne));
		System.out.println();

	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double number = in.nextDouble();
		System.out.print("Input another number: ");
		double numberOne = in.nextDouble();
		System.out.print("Input one more number: ");
		double numberLast = in.nextDouble();

		double numNew = (Math.max(number,numberOne));

		System.out.println(Math.max(numNew,numberLast));
		
		double numLast = (Math.min(number,numberOne));
		
		System.out.println(Math.min(numberLast,numLast));
		


	}
	public static void q6() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String text = in.nextLine();
		System.out.print(text.contains("on"));
		System.out.println();
	}
	public static void q7() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String newText = in.nextLine();
		System.out.print(newText.equalsIgnoreCase("mango"));
		System.out.println();
	}
	public static void q8() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = in.nextLine();
		System.out.print("Input a letter: ");
		String text = in.nextLine();
		System.out.println(word.indexOf(text.charAt(0)));

	}

	public static void q9() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("");
	}
	public static void q10() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("");
	}

	public static void q11() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("");
	}

	public static void q12() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("");
	}
	

}
