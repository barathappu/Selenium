import java.util.ArrayList;


public class Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] ar = new int[] {1,2,100,3,4,5,6,88,99,772,55};
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2 == 0) {
				System.out.println(ar[i]);
			}
		}
		//arraylist
		ArrayList <String> a = new ArrayList<String>();
		a.add("Appu");
		a.add("0");
		a.add("8");
//		System.out.println(a);
//		a.add(Arrays.toString(ar));
//		System.out.println(a);
		
		/* for(int i=0; i <a.size(); i++) */
			/*
			 * { System.out.println(a.get(i)); }
			 * 
			 * //enhanced loop System.out.println("************"); for(String val :a) {
			 * System.out.println(val); }
			 */
		System.out.println(a.contains("Appu"));
		
		String s0 = "I Love You";
		String[] split = s0.split("Love");
		System.out.println(split[0]);
		System.out.println(split[1].trim());
		//System.out.println(split[2]);
		
	}

}
