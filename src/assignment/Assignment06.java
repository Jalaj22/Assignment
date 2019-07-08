package assignment;

import java.util.HashMap;
import java.util.Map;

/*6. HashMap with regnum as key and mark as value.
find the avg of marks whose key is odd.
input:{12:90,35:90,33:90,56:88}
output:avg of(90+90) =90*/

public class Assignment06 {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(12,90);
		hm.put(35,90);
		hm.put(33,90);
		hm.put(56,88);
		int ans = 0 ;			int n=0;
		for(Map.Entry<Integer,Integer> me:hm.entrySet())
		{
			int no = me.getKey();
			
			if(no%2!=0)
			{
				ans = ans + me.getValue();
				n++;
			}
		}System.out.println((ans/n));
	}

}
