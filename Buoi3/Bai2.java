import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
			int n;
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			
		    int[] array = new int[n];
		    for(int i=0;i<n;++i) {
		    	array[i]=sc.nextInt();
		    }
		    int count=0;
		    for(int i=1;i<n;++i) {
		    	int s =array[i-1]+1;
		    	if(s!=array[i]) {
		    		System.out.print(s+" ");
		    		++count;
		    	}
		    	
		    }
		    if(count==0) System.out.print("YES");
	}
}
