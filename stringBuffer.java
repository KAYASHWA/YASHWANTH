package String;

public class stringBuffer {
	public static void main(String[] args) {

		String str1 = new String("Hello");
		String str2 = new String("Hello");

		System.out.println(str1 == str2);// reference - false
		System.out.println(str1.equals(str2)); // content - true

		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");

		System.out.println(sb1 == sb2); // reference - false
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.reverse());
		int len = str1.length();
		System.out.println("Length : " + len);
		
		StringBuilder sbr1 = new StringBuilder("World");
		StringBuilder sbr2 = new StringBuilder("World");
		
		System.out.println(sbr1==sbr2);
		System.out.println(sbr1.equals(sbr2));
		System.out.println(sbr1.capacity());
		System.out.println(sb1.length()); 
		System.out.println(sbr1.append("afaerga"));
		System.out.println(sbr1.length()); 
		System.out.println(sb1.capacity()); 
	    
	

	}
}