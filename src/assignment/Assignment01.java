package assignment;

/*1.Given two integer arrays. merge the common elements into a new array.
 *  find the sum of the elements
input1:{1,2,3,4}
input2:{3,4,5,6}
logic:{3,4}
output:7*/
public class Assignment01 {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4};
		int b[]={3,4,5,6};
		int total=0;
		int index=0;
		int c[] = new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c[index]=a[i];
					index++;
				}
			}
		}
		for(int n=0;n<index;n++)
		{
			System.out.println(c[n]);
			total=total+c[n];
		}System.out.println("Addition is:"+total);
	}

}
