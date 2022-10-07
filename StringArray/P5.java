package StringArray;

public class P5 {

	public static void main(String[] args) {
		
		int number=2103434;
		long time;

		StringBuffer sb=new StringBuffer();
		time=System.currentTimeMillis();
		for(int i=number;i>0;i--) 
		{
			sb.append("");
		}
		System.out.println(System.currentTimeMillis() - time);
		
		StringBuilder sb1 = new StringBuilder();
		time = System.currentTimeMillis();
		for (int i = number; i > 0; i--) {
			sb1.append("");
		}
		System.out.println(System.currentTimeMillis() - time);
		
		
		
	}
	
	
}
