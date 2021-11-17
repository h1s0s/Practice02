package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익(만원): ");
		double pay = sc.nextDouble();
		
		if(0<pay && pay<=1000) {//0원 이상 1000만원 이하인 경우
			double tax = 0.09*pay;
			System.out.println("소득세는 "+tax+" 입니다.");
		} else if(1000<pay && pay<=4000) {//1000만원초과 4000만원 이하
			double tax = (1000*0.09)+0.18*(pay-1000);
			System.out.println("소득세는 "+tax+" 입니다.");
		} else if(4000<pay && pay<=8000) {//4000만원초과 8000만원 이하
			double tax = (1000*0.09)+3000*0.18+0.27*(pay-4000);
			System.out.println("소득세는 "+tax+" 입니다.");
		} else if(8000<=pay) {//8000만원 이상
			double tax = (1000*0.09)+3000*0.18+4000*0.27+0.36*(pay-8000);
			System.out.println("소득세는 "+tax+" 입니다.");
		} else {//그 외의 숫자가 입력되었을때
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}

}
