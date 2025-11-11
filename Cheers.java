//feedback

// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String cheer = args[0];
        String cheerUpperCase = args[0].toUpperCase();
        String anLetters = "AEFHILMNLORSX";
	int numOfTimes = Integer.parseInt(args[1]); 
        for (int i = 0; i < cheerUpperCase.length(); i++) {
                char letter = cheerUpperCase.charAt(i);
                if(anLetters.indexOf(letter) == -1) {
                        System.out.println("Give me a " + cheerUpperCase.charAt(i) + ": " + cheerUpperCase.charAt(i) +"!");
                } else {
                        System.out.println("Give me an " + cheerUpperCase.charAt(i) + ": " + cheerUpperCase.charAt(i) +"!");
                }
        } System.out.println("What does that spell?");
        for (int i = 0; i < numOfTimes; i++) {
                System.out.println(cheerUpperCase + "!!!");
        }
        }
}
