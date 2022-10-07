package StringArray;

public class P2 {

	public static void main(String[] args) {
		
		
		
		String str= "Yash Technologies";
        char arr[]=str.toCharArray();
        char temp;
        int i=0;
        
        //Print String in Ascending Order 
        while(i<arr.length)
        {
            int j=i+1;
            while(j<arr.length) 
            {
                if(arr[j]<arr[i])
                {
                	temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
            i++;
        }
        System.out.println(str);
        System.out.print("Ascending:");
        System.out.println(arr);
        
        //Print String in Descending Order
        i=0;
        while(i<arr.length)
        {
            int j=i+1;
            while(j<arr.length) 
            {
                if(arr[j]>arr[i])
                {
                	temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
            i++;
        }
        System.out.print("Descending:");
        System.out.println(arr);
    
	}
	
	
}
