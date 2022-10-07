package StringArray;

public class AP2 {

	public static void main(String[] args) {
		
		int[] arr= {43,45,8,6767,67,8,3,1,45,56,87,8,67,8327};
		
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int num=arr[i];
			count=1;
			if(num>0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(num==arr[j])
					{
						count++;
						arr[j]=-1;
					}
				}
				System.out.println(num+" :"+count);
			}
			
		}
		
		
	}
	
}



