// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
package 조건문;


import java.util.Scanner;

public class num1330 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if(A < B) {
			System.out.println("<");
		}else if(A > B) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}

	}

}
