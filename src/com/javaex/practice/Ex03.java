package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//수정사항 : int 초기화 삭제
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();//수정사항 : 자료형 추가
		
		if(age>20) {
			System.out.print("1번그룹");//수정사항 println->print 개행X
		} else {
			System.out.print("2번그룹");//수정사항 println->print 개행X
		}
		System.out.println("입니다.");
		
		sc.close();
	}

}
