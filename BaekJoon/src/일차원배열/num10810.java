package 일차원배열;

import java.util.Scanner;

public class num10810 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
				
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N];
		
		for(int a = 0 ; a < M; a++) {

			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int b=i-1; b<=j-1; b++) {

				arr[b] = k;
		
			}
			
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
	}

}
