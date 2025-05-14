import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter integers: ");
	int userInput = input.nextInt();

	int number = userInput;
	int remainder = 0;
	int reverse = 0;

	while (number != 0){
	
	remainder += number % 10;
	number = number / 10;
	reverse = remainder * 10;
	}
	if (userInput == reverse){
		System.out.print( reverse + " Input is a palindrome");
	}
	else{
		System.out.print(reverse + " Input is not a palindrome");
	}
	
	}
}