public class CaseLetterDetector {

	public static void main(String[] args){

	String sentence = "Welcome to JavaScript";

		int bigLettersCount = 0;
		int smallLettersCount = 0;
		for(int index = 0; index < sentence.length(); index++){
		if (sentence.charAt(index) >= 'A' && sentence.charAt(index) <= 'Z'){
			bigLettersCount += 1;
		}
		if (sentence.charAt(index) >= 'a' && sentence.charAt(index) <= 'z'){
			smallLettersCount += 1;
		}
		}
	System.out.printf("There are %d uppercase and %d lowercase letters in \"%s\".%n", bigLettersCount, smallLettersCount, sentence);
	}
}