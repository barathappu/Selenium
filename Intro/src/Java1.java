public class Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myNum = "08";
		String myName = "Appu";
		System.out.println(myName + " " + myNum);
		
		//Array
		// we can create array on creating the variable or we create variable once then we can add the values in it
		int [] arr = new int[5];
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[4] = 44;
		arr[3] = 55;
		
		int [] ar = new int[] {1,2,3,4,5,6};
		
		/*
		 * System.out.println(Arrays.toString(arr));
		 * System.out.println(Arrays.toString(ar));
		 */	
		
		for(int i=0; i <arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//enhanced loop
		System.out.println();
		for(int a : ar) {
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
