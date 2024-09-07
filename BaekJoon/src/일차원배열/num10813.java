package 일차원배열;

import java.util.Scanner;

public class num10813 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N];
		
		
		for(int k=1; k<=N; k++) {
			arr[k-1]= k;
		}
		
		for(int a = 0; a < M; a++) {
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			int tmp[] = {0};
			
			tmp[0] = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = tmp[0];
	
	
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}

}
