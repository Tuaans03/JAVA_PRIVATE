
import java.util.Scanner;
import java.lang.Math;

public class bai4 {

	public static int snt(int n) {
		if(n<2) return 0;
		
		for(int i=2;i<n;++i) {
			if(n%i==0) {
				return 0;
			}
		}
		return 1;
	}
	
	public static int csnt (int n) {
		
		while(n<0) {
			int t = n%10;
			if(snt(t) == 0) return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] array = new int [n];
		for(int i=0;i<n;++i) {
			array[i]= sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;++i) {
			if(snt(array[i])==1 && csnt(array[i])==1) {
				System.out.print(array[i]+" ");
				++count;
			}
		}
		if(count ==0) System.out.print("NO");
	}
}
