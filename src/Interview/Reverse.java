package Interview;

public class Reverse {
//StringBuffer sbf = new StringBuffer("MyJava");

	// System.out.println(sbf.reverse()); //Output : avaJyM
	public static void main(String[] args) {

		String rev = reverse("Myname");
		System.out.println();
		System.out.println("this is not Revers------- " + rev);
		String strem = Remove("**#Ja$va");
		System.out.println("this is not Remove------- " + strem);
		String space = Removespace("   *what*   #Java%   ");
		System.out.println("this is not RemoveSpace------- " + space);
		
		
		
		
		
	}

	public static String reverse(String st) {
		char[] starr = st.toCharArray();
		// char[] starr= new char[st.length()];
		System.out.println("this is reverse  ");
		for (int i = starr.length - 1; i >= 0; i--) {

			System.out.print(starr[i]);

		}
		// StringBuffer Manu = new StringBuffer(st);
		return st;

		// System.out.print("Revers " + Manu.reverse());
	}

	public static String Remove(String str) {
		String plainstring = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("this is remove string------- " + plainstring);
		return str;
	}
	public static String Removespace(String spc) {
		String spcstring = spc.replaceAll("\\s", "");
		System.out.println("this is remove Space------- " + spcstring);
		return spc;
	}
}
