package com.kiosk.again;

import java.util.ArrayList;

public class ProcDrink {
	Display d = new Display();
	
	public void menu(ArrayList<Goods> basket) {
		
		loop:
		while(true) {
			Command cmd = new Command();
			String s = cmd.getCommand(d.DRINK_MENU);
			switch(s) {
			case "1" :
				System.out.println("콜라 선택");
				Drink ck = new Drink();
				ck.name = "콜라";
				ck.price = 1400;
				ck.extraDate = "20230803";
				basket.add(ck);
				break;
			case "2" :
				System.out.println("사이다 선택");
				Drink cd = new Drink();
				cd.name = "사이다";
				cd.price = 1400;
				cd.extraDate = "20230803";
				basket.add(cd);
				break;
			case "3" :
				System.out.println("환타 선택");
				Drink t = new Drink();
				t.name = "환타";
				t.price = 1400;
				t.extraDate = "20230803";
				basket.add(t);
				break;
			case "4" :
				System.out.println("주스 선택");
				Drink ju = new Drink();
				ju.name = "주스";
				ju.price = 1400;
				ju.extraDate = "20230803";
				basket.add(ju);
				break;
			case "5" :
				System.out.println("아메리카노 선택");
				Drink am = new Drink();
				am.name = "아메리카노";
				am.price = 2300;
				am.extraDate = "202201203";
				basket.add(am);
				break;
			case "6" :
				System.out.println("딸기쉐이크 선택");
				Drink ms = new Drink();
				ms.name = "딸기쉐이크";
				ms.price = 2000;
				ms.extraDate = "20220810";
				basket.add(ms);
				break;
			case "b" :
				System.out.println("메인메뉴로 돌아갑니다.");
				break loop;
			default :
				d.error();
				break;
			}
			
			
		}
	}
}
