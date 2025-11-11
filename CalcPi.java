// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numOfTerms = Integer.parseInt(args[0]);
		int i = 1;
		double sum = 1.0;
		System.out.println("pi accoriding to java: " + Math.PI);
	 while (i < numOfTerms) {
		if (i % 2 == 0) {
			sum = sum + 1.0 / (2*i + 1);
		} else {
			sum = sum - 1.0 / (2*i + 1);
		}
		i++;	
	} System.out.println("pi, approximated: " + sum * 4);
}
	
	
}
