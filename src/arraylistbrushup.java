import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylistbrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> mynum = new ArrayList<Integer>();
		int[] num = {0,1,2,3,4,5,6,7,8,9,10,122};
		
		mynum.add(22);
		mynum.add(26);
		mynum.add(29);
		mynum.add(30);
		
		for(int i=0; i<mynum.size(); i++)
		{
			System.out.println(mynum.get(i));
		}
		
		System.out.println("**********");
			
		for(int a:mynum){
			System.out.println(a);
		}
		
		System.out.println(mynum.contains(30));
		
		List<int[]> conarray = Arrays.asList(num);
		
		conarray.contains(123);

	}

}
