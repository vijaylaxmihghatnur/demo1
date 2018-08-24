import java.io.*;
public class multidimensional
{
	public static void main(String[] args) 
		{
			int arr[][]={{2,7,9},{3,6,1},{7,4,2}};
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				System.out.print(arr[i][j]+" ");
				System.out.println();
			}
			int sum=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				sum = sum + arr[i][j];
				
			}
			System.out.print("sum of matrix : "+ sum);
			System.out.println();
			
			int max=arr[0][0];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				if(max<arr[i][j])
				max= arr[i][j];
			}
		System.out.println("Largest of numbers is : " + max);
		
		int d1 = 0, d2 = 0,n=3;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j)
                    d1 += arr[i][j];
                if (i == n - j - 1)
                    d2 += arr[i][j];
            }
        }
		System.out.println("sum of primary daigonal : " + d1);
		System.out.println("sum of secondary daigonal : " + d2);
		}
		
		
	
}