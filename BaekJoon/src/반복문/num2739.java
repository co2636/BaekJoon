/*
 	N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */

package 반복문;

import java.util.Scanner;

public class num2739 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int N = scanner.nextInt();

		for(int i =1; i < 10; i++) {
			System.out.println(N + " * " + i +" = " + N*i);
		}
		
	}

}
