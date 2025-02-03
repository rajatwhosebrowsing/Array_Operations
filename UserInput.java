//UserInput.java
import java.util.Scanner;

public class UserInput{
	public int[] arrayInput(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scan.nextInt();
		
		if(size<=0){
			System.out.println("Error");
		}
		int[] array=new int[size];
		System.out.println("Enter" +size +"numbers:");
		
		for(int i=0;i<array.length;i++){
			array[i]=scan.nextInt();
		}
		scan.close();
		return array;
	}
}