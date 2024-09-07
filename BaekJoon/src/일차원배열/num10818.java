package 일차원배열;

import java.util.Scanner;

public class num10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int []arr = new int[N];

		int i;
		for(i=0; i<N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int num : arr) {
			if(num > max) {
				max = num;
			}else if(num < min){
				min = num;
			}
		}

		System.out.print(min + " ");
		System.out.print(max);
	}


}
