package section02;
/*
*
* Scanner
* 	사용자로부터 데이터를 읽기위해 사용되는 클래스
* 	Scanner 클래스를 사용하면 키보드로 입력한 텍스트, 숫자등
* 	읽을수 있다.
*
*
*/

import java.util.Scanner;

public class scannerEx {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name, address; // 문자열 값을 담는 변수
		int age;			// 정수 값을 담는 변
		double weight;		// 실수 값을 답는 변수
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하시오.");
		
		name = scan.next(); // name = "승찬"
		address = scan.next(); // address = "서울"
		age = scan.nextInt();	// age = 27
		weight = scan.nextDouble();	// weight = 70;
		
		System.out.printf("당신의 이름은 %s 입니다./n", name);
		System.out.printf("당신의 주소은 %s 입니다./n", address);
		System.out.printf("당신의 체중은 %.1fkg 입니다./n", weight);
		System.out.printf("당신의 나이는 %d 입니다./n", age);
		
			
					
		
	}

}
