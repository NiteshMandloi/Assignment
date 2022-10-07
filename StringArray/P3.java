package StringArray;

public class P3 {

	public static void main(String[] args) {
		
		String s="yash technologies";
		
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				s=s.replace(s.charAt(i), '0');
			}
		}
		
		s=s.replaceAll("0","");
		System.out.println(s);
	}
	
	
	
}
