//Main.java

public class Main{
	public static void main(String[] args){
		UserInput in = new UserInput();
		Arrayfn functions =new Arrayfn();
		
		int[] array = in.arrayInput();
		functions.oddEven(array);
		functions.smallest(array);
       	 	int minIndex = functions.smallestdistanceindex(array);
        	System.out.println("Index of the smallest distance: " + minIndex);
		        String[] array = UserInput.getUserInput();
        	List<String> arrayList = ArrayListConverter.arrayToArrayList(array);
        
        	System.out.println("Array converted to ArrayList: " + arrayList);
        	
        	String[] newArray = ArrayListConverter.arrayListToArray(arrayList);
        	System.out.println("ArrayList converted back to Array: " + 				Arrays.toString(newArray));

		
	}
}