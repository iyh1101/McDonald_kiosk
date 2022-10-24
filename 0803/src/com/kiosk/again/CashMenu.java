package com.kiosk.again;

import java.util.ArrayList;
import java.util.Scanner;

public class CashMenu {
	Display d = new Display();
	
	public void cash(ArrayList<Goods> basket) {
		loop:
		while(true) {
		if(basket.size() == 0) {
			d.noMenu();
			break loop;
		} else {
		System.out.println("계산하기");
		System.out.println("장바구니에 담긴 메뉴는");
		
		for(int i = 0; i < basket.size(); i++) {
			if(basket.get(i) instanceof Burger) {
				System.out.println(basket.get(i).name + " " +basket.get(i).price + "원 / 유통기한: " + ((Burger)basket.get(i)).extraDate + "까지");
			}
		}
		for(int i = 0; i < basket.size(); i++) {
			if(basket.get(i) instanceof Drink) {
				System.out.println(basket.get(i).name + " " +basket.get(i).price + "원 / 유통기한: " + ((Drink)basket.get(i)).extraDate + "까지");
			}
		}
		for(int i = 0; i < basket.size(); i++) {
			if(basket.get(i) instanceof Side) {
				System.out.println(basket.get(i).name + " " +basket.get(i).price + "원 / 유통기한: " + ((Side)basket.get(i)).extraDate + "까지");
			}
		}
		for(int i = 0; i < basket.size(); i++) {
			if(basket.get(i) instanceof Dessert) {
				System.out.println(basket.get(i).name + " " +basket.get(i).price + "원 / 유통기한: " + ((Dessert)basket.get(i)).extraDate + "까지");
			}
		}
		
		int sum = 0;
		for(int i = 0; i < basket.size(); i++) {
			sum = sum + basket.get(i).price;
		}
		System.out.println("총 금액 " + sum + "원 입니다");
			}
		System.out.println("1.카드결제 2.쿠폰입력 b.결제취소 및 메인메뉴");
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		switch(c) {
		case "1" :
			d.cash();
			System.out.println("결제 완료");
			System.out.println("영수증 출력 [ y / n ]");
			String yn = sc.next();
			if(yn.equals("y") ) {
				System.out.println("영수증 출력\n방문해주셔서 감사합니다");
				basket.clear();
				break loop;
			} else if(yn.equals("n") ) {
				System.out.println("방문해주셔서 감사합니다");
				basket.clear();
				break loop;
			} else {
			System.out.println("영수증은 몰?루");
			basket.clear();
			break loop;
			}
		case "b" :
			System.out.println("메인메뉴로 돌아갑니다");
			break loop;
		}
		d.error();
		break;
		
		} //while
	} //function
}
