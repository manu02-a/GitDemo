import java.util.ArrayList;

public class Java_brushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {0,1,2,3,4,5,6,7,8,9,10,122};
		
		System.out.println("Multiples af 2 numbers are:");
		
		ArrayList<Integer> renum = new ArrayList<Integer>();
		for(int i =0; i<num.length; i++)
		{
			
			if(num[i] % 2 == 0)
			{
				
				System.out.println(num[i]);
			}
			else
			{
				renum.add(num[i]);
			}
			
		}
		
		System.out.println("The not multiples of 2 numbers are:");
		for(int k:renum)
		{
			System.out.println(k);
				
			}
			
		}
	
	}


