package assignment;

/*7.  A integer input is accepted.
find the square of individual digits and find their sum.
input:125
output:1*1+2*2+5*5*/

public class Assignment07 {

	public static void main(String[] args) {
		
		int no = 125;			int ans = 0 ;
		
		while(no!=0)
		{
			int rem	=0;
			rem=no%10;	
			ans = ans + (rem*rem);
			
			no = no/10;
		}System.out.println(ans);
	}

}
