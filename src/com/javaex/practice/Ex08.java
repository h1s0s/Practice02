package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 3개 입력해주세요.");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();
		
		if (num1<num2 && num1<num3) {//num1이 가장 작을때
			System.out.println("가장 작은 수는 "+num1+" 입니다.");
		} else if (num2<num1 && num2<num3) {//num2가 가장작을때
			System.out.println("가장 작은 수는 "+num2+" 입니다.");
		} else if (num3<num1 && num3<num2) {//num3이 가장작을때
			System.out.println("가장 작은 수는 "+num3+" 입니다.");
		} else if (num1==num2 && num1<num3) {//num1,2가 같고 가장작을때
			System.out.println("가장 작은 수는 "+num1+" 입니다.");
		} else if (num1==num3 && num1<num2) {//num1,3이 같고 가장작을때
			System.out.println("가장 작은 수는 "+num1+" 입니다.");
		} else if (num2==num3 && num2<num1 ) {//num2,3이 같고 가장 작을때
			System.out.println("가장 작은 수는 "+num2+" 입니다.");
		} else if (num1==num2 && num1==num3) {//num1,2,3이 같을때
			System.out.println("가장 작은 수는 "+num1+" 입니다.");
		}
		
		sc.close();
	}

}
