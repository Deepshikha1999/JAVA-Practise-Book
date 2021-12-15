
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		int [][]arr1= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}System.out.println();
		}
		
		int a[]= {50,10,70,20,30};
		int temp;
		
		for(int i=0;i<a.length-1;i++)
		{
			int small=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[small]>a[j])
				{
					small=j;
				}
			}
			if(small!=i)
			{
				temp=a[i];
				a[i]=a[small];
				a[small]=temp;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}

}
