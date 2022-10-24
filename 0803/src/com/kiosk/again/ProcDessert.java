package com.kiosk.again;

import java.util.ArrayList;

public class ProcDessert {
	Display d = new Display();
	
	public void menu(ArrayList<Goods> basket) {

		loop:
		while(true) {
			Command cmd = new Command();
			String s = cmd.getCommand(d.DESSERT_MENU);
			switch(s) {
			case "1" :
				System.out.println("아이스크림 콘 선택");
				Dessert ic = new Dessert();
				ic.name = "아이스크림 콘";
				ic.price = 800;
				ic.extraDate = "20230824";
				basket.add(ic);
				break;
			case "2" :
				System.out.println("초코콘 선택");
				Dessert cc = new Dessert();
				cc.name = "초코콘";
				cc.price = 1000;
				cc.extraDate = "20230824";
				basket.add(cc);
				break;
			case "3" :
				System.out.println("맥플러리 선택");
				Dessert m = new Dessert();
				m.name = "맥플러리";
				m.price = 2500;
				m.extraDate = "20230824";
				basket.add(m);
				break;
			case "4" :
				System.out.println("오레오 아포가토 선택");
				Dessert oa = new Dessert();
				oa.name = "오레오 아포가토";
				oa.price = 3000;
				oa.extraDate = "20221124";
				basket.add(oa);
				break;
			case "5" :
				System.out.println("선데이 아이스크림 선택");
				Dessert si = new Dessert();
				si.name = "선데이 아이스크림";
				si.price = 1500;
				si.extraDate = "20230824";
				basket.add(si);
				break;
			case "6" :
				System.out.println("밀크셰이크 선택");
				Dessert ms = new Dessert();
				ms.name = "밀크셰이크";
				ms.price = 2500;
				ms.extraDate = "20220820";
				basket.add(ms);
				break;
			case "7" :
				System.out.println("칠러 선택");
				Dessert c = new Dessert();
				c.name = "칠러";
				c.price = 2000;
				c.extraDate = "20230824";
				basket.add(c);
				break;
			case "8" :
				System.out.println("애플파이 선택");
				Dessert a = new Dessert();
				a.name = "애플파이";
				a.price = 1200;
				a.extraDate = "20221024";
				basket.add(a);
				break;
			case "9" :
				System.out.println("츄러스 선택");
				Dessert cr = new Dessert();
				cr.name = "츄러스";
				cr.price = 1500;
				cr.extraDate = "20221024";
				basket.add(cr);
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
