import java.util.ArrayList;

public class Arrayfn{
	public void display(ArrayList<Integer> array){
		System.out.println("Array is: "+ array);
	}
	
	public void oddEven(int[]array){
		ArrayList<Integer>even = new ArrayList<>();
		ArrayList<Integer>odd = new ArrayList<>();
		
		for(int i=1;i<array.length;i++){
			if(array[i]%2 == 0){
				even.add(array[i]);
			}
			else{
				odd.add(array[i]);
			}
		}
		System.out.println("Even numbers");
		display(even);
		System.out.println("Odd numbers");
		display(odd);
	}
	public void smallest(int[]array){
		if(array.length == 0){
			System.out.println("Array is empty.");
			return;
		}
		int smallest =array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]<smallest){
				smallest=array[i];
			}
		}
		System.out.println("The smallest number is:"+smallest);
	}
	public int smallestdistanceindex(int[]array){
		if(array==null || array.length <2){
			return -1;
		}

		int minDistance = Integer.MAX_VALUE;
		int minIndex=-1;
		for(int i=0;i<array.length-1;i++){
			int distance= Math.abs(array[i]-array[i+1]);
			
			if(distance<minDistance){
				minDistance=distance;
				minIndex=i;
			}
		}
		return minIndex;		

	}
	class ArrayListConverter {
 	   public static List<String> arrayToArrayList(String[] array) {
        	return new ArrayList<>(Arrays.asList(array));
    	}

	    public static String[] arrayListToArray(List<String> arrayList) {
	        return arrayList.toArray(new String[0]);
	    }
	}

	
}