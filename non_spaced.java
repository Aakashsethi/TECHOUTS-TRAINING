public class non_spaced {
	
	public static void main(String[] args) {
		int rows=5;      
		//inner loop  
		for (int i= rows-1; i>=0 ; i--)  
		{  
		//outer loop  
		for (int j=0; j<=i; j++)  
		{  
		//prints star and space  
		System.out.print("*");  
		}  
		
		//throws the cursor in the next line after printing each line  
		System.out.println();  
		} 
		
		for(int j=2; j<=rows ;j++)
		{
			for(int i=0;i<j;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}  
}
