package assignment;

/*5. Retrieve the palindorme-true number set from given number limit and
return the sum
input1:90 input2:120
logic:99+101+111
output:311*/

public class Assignment05 {

	public static void main(String[] args) {
//-------------------------------------------------------------------------
		int ans = 0 ;
		for(int no=90;no<=120;no++)
		{
			int n1 = no;
			int n3 = 0;
			while(n1!=0)
			{
				int x = n1 % 10;
				n3 = (n3 * 10) + x;
				n1 = n1/10;
			}
			
			if(no==n3)
			{
				ans = ans + no;
			}
		}System.out.println(ans);
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------		
		/*int ans= 0 ;
		for(int i=90;i<=120;i++)
		{
			int no=i;
			
			String s = Integer.toString(i);
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			String s1 = sb.toString();
			
			if(s.equals(s1))
			{
				ans = ans + no;
			}
		}System.out.println(ans);*/
	}

}
