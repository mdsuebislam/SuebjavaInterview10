package Interview;

public class interview {

	public static void main(String []arg) {
		String test="Lowes Payments";
	
		char [] car=test.toCharArray();
		
	
		
		for (int i=car.length-1; i>=0; i--) {
			System.out.print(" "+ car[i]);
		}

	}
}
