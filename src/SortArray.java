import java.util.*;
public class SortArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int arrayNum = input.nextInt();
		String[] cityArray = new String[arrayNum];
		
		for(int i = 0; i < cityArray.length; i++){
			
			cityArray[i] = input.next(); 
			
		}
		
		Arrays.sort(cityArray);
		
		for(int j = 0; j < cityArray.length; j++){
			
			System.out.println(cityArray[j]);
			
		}
		
		input.close();
	}

}
