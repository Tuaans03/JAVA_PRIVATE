
import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;++i) {
			array[i] = sc.nextInt(); 
		}
		
		int max=0;
		int count=1;
		for(int i=1;i<n;++i) {
			
			if(array[i-1] <= array[i]) {
				++count;
			}
			if(array[i-1] > array[i]) {
				count=1;
			}
			if(max<count) {
				max=count;
			}
			
		}
		
		System.out.print(max);
	}
	
}
