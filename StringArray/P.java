package StringArray;

public class P {

	public static void main(String[] args) {
		
		 String string1 = "Yash Technologies";  
	        int z;  
	          
	        char c[] = string1.toCharArray();  
	          
	        for(int i = 0; i <c.length; i++) {  
	            z = 1;  
	            for(int j = i+1; j <c.length; j++) {  
	                if(c[i] == c[j] && c[i] != ' ') {  
	                    z++;  
	                    c[j] = '0';  
	                }  
	            }  
	            if(z > 1 && c[i] != '0')  
	                System.out.println(c[i]);  
	        }  
	}
}
