package 반복문;

import java.util.Scanner;

public class num10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		for(int i = 0; ; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				break;
			}
			else {

				System.out.println(A + B);
				continue;
			}
		}

	}

}
