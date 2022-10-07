package StringArray;

public class AP1 {

	public int getThirdHighest(int arr[])
	{  
		int temp;  
		for(int i=0;i<arr.length;i++)   
		{
			for(int j=i+1; j<arr.length;j++)
			{  
		         if (arr[i]>arr[j])   
		         {  
		              temp=arr[i];  
		              arr[i]=arr[j];  
		              arr[j]=temp;  
		         }  
		     }  
		 }  
		       return arr[arr.length-3];  
		}  
		public static void main(String args[])
		{  
			int intwww[]={876,12,656,21,56,435,65};
			AP1 aprr=new AP1();
			System.out.println("Third Largest: "+aprr.getThirdHighest(intwww));  
		}

	
}
