
public class Javabasics_brushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		String name = "Manoj";
		boolean b = true;
		float f = 2.99f;
		double dec = 9.00009999;
		char l = 'r';
		
		System.out.println(f);
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 17;
		arr[4] = 19;
		
		System.out.println(arr[3]+1);
		
		int[] arr2 = {1,3,5,67,20,100};
		
		System.out.println(arr2[3]);
		System.out.println("array arr2 elements");
		
		//iterating through for loop
		
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		System.out.println("array arr elements");
		
		for(int a:arr)
		{
			System.out.println(a);
		}
		
		String[] names = {"Manoj", "Rahul", "Kumar", "Joe"};
		
		for(String s:names) {
			System.out.println(s);
		}
		
		String s = "Please use temporary password 'rahulshettyacademy' to Login.";
		String[] array1 = s.split("'");
		for(String i:array1)
		{
			System.out.println(i.trim());
		}
		
	}

}
