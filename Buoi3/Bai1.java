package examples;

import java.util.Scanner;


public class Bai1 {

public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("Nhap vao so n");
		n = sc.nextInt();
	}while(n<2);
	
	int[] array = new int [n];
	for(int i=0;i<n;++i) {
		array[i] = sc.nextInt();
		}
	
	//sap xep
	
	for(int i=0;i<n-1;++i) {
		for(int j=i+1;j<n;++j) {
			if(array[i]>array[j]) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
	}
}
	int count=1;
	for(int i=0;i<n;++i) {
		if(i==0) {
			System.out.print(array[i] +" : ");
			continue;
		}
		
		if(array[i-1]!=array[i]) {
			System.out.println(count);
			count=1;
			System.out.print(array[i] + " : ");
		}
		else {
			++count;
		}
	}
	System.out.print(count);
}
}
	
