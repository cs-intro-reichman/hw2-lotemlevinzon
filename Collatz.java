// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		if (mode.equals("v")) {
		for (int i = 1; i <= seed; i++) {
			int count = 0;
			int curNum = i;
			System.out.print(curNum + " ");
		while ( i <= seed) {
			if (curNum % 2 == 0) {
				curNum = curNum / 2;
			} else {
				curNum = curNum * 3 + 1;
			}
			System.out.print(curNum + " ");
			count++;
			if (curNum == 1) {
				break;
			}
		} System.out.println("(" + (count + 1) + ")");
	}  System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	} else if (mode.equals("c")) {
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}

	

		
	}
}
