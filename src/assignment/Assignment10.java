package assignment;

import java.util.LinkedHashSet;

/*10. input1={1,2,3}
input2={3,4,5}
input3;+(union)
output:inp1+inp2
input1:{1,2,3,4,5}
input 2:{2,3,4,5}
input3=*(intersection)
output:inp1*inp2
INPUT1:{1,2,3,4,5}
INPUT2:{3,6,7,8,9}
INPUT3:-(MINUS)
output:inp1-inp2*/

public class Assignment10 {

	public static void main(String[] args) {
	
/*		int no[]={1,2,3};			int no1[]={3,4,5};
		int ans[] = new int[no.length+no1.length];		int index=0;
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		for(int i=0;i<no.length;i++)
		{
			int n= no[i];
			hs.add(n);
		}
		for(int i=0;i<no1.length;i++)
		{
			int j=no1[i];
			hs.add(j);
		}
		for(int x:hs)
		{
			ans[index] = x;
			index++;
		}
		for(int i=0;i<index;i++)
		{
			System.out.print(ans[i]+" ");
		}*/
//------------------------------------------------------------------------		
		/*input1:{1,2,3,4,5}
	input 2:{2,3,4,5}
	input3=*(intersection)*/
		/*int no[]={1,2,3,4,5};		int no1[]={2,3,4,5};
		int c[] = new int[no.length+no1.length];		int index=0;
		int count=0;
		for(int i=0;i<no.length;i++)
		{
			for(int j=0;j<no1.length;j++)
			{
				if(no[i]==no1[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				c[index]=no[i];
				index++;
				count=0;
			}
			else
			{
				count=0;
			}
		}
		for(int x=0;x<index;x++)
		{
			System.out.print(c[x]+" ");
		}*/
//------------------------------------------------------------------------	
	
		/*INPUT1:{1,2,3,4,5}
	INPUT2:{3,6,7,8,9}
	INPUT3:-(MINUS)
	output:inp1-inp2*/
		
		int no[]={1,2,3,4,5};			int no1[]={3,6,7,8,9};
		int ans[]=new int[no.length+no1.length];		int index=0;
		
		for(int i=0;i<no.length;i++)
		{
			int c = no[i]-no1[i];
			ans[index] = c ; 
			index++;
		}
		for(int i=0;i<index;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
	
	

}
