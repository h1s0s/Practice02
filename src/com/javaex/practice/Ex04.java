package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		if(19<=age && age<65) {
			System.out.println("1번그룹 입니다.");
		} else {
			System.out.println("2번그룹 입니다.");
		}
		
		sc.close();
	}

}
