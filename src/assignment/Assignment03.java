package assignment;

/*3. arraylist of string type which has name#mark1#mark2#mark3 format.
retrieve the name of the student who has scored max marks(total of three)
input:{"arun#12#12#12","deepak#13#12#12"}
output:deepak*/

public class Assignment03 {

	public static void main(String[] args) {
	
		String n[]={"arun#109#12#12","deepak#13#12#12","namrata#20#20#20"};
		
		String ans = "";		int ans1 = 0,add=0;
		for(int i=0;i<n.length;i++)
		{
			String x = n[i];
			String a[] = x.split("#");
			
			for(int j=1;j<a.length;j++)
			{
				String n1 = a[j];
				int no = Integer.parseInt(n1);
				add = add + no;
				
			}
			
			if(ans1<add)
			{
				ans1 = add;
				ans = a[0];
			}
			add=0;
		}System.out.println(ans);

		/*int total[]=new int[n.length];			int k=0;
		for(int i=0;i<n.length;i++)
		{
			String s = n[i];			
			String s1[]=s.split("#");
			int ans=0;
			for(int j=1;j<s1.length;j++)
			{
				String s2 = s1[j];
				int no = Integer.parseInt(s2);
				ans=ans+no;
			}total[k]=ans;
			k++;
			
		}
		
		for(int i=0;i<total.length;i++)
		{
			System.out.println(total[i]);
		}
		
		char c = '#';
		
		if(total[0]>total[1])
		{
			String d = n[0];		
			String ans="";
			for(int i=0;i<d.length();i++)
			{
				if(d.charAt(i)==c)
				{
					break;
				}
				else
				{
					ans = ans+d.charAt(i);
				}
			}System.out.println(ans);
		}
		else
		{
			String d = n[1];		String ans="";
			for(int i=0;i<d.length();i++)
			{
				if(d.charAt(i)==c)
				{
					break;
				}
				else
				{
					ans = ans+d.charAt(i);
				}
			}System.out.println(ans);
		}
*/				
		
	}

}
