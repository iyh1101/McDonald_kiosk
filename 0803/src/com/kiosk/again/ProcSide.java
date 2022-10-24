package com.kiosk.again;
import java.util.ArrayList;

public class ProcSide {
	Display d = new Display();
	
	public void menu(ArrayList<Goods> basket) {
		//1.스낵랩 2.맥너겟 6조각 3.맥스파이시 치킨 텐더 2조각 4.맥윙 4조각 5.후렌치 후라이 6.골든 모짜렐라 치즈스틱
		loop:
		while(true) {
			Command cmd = new Command();
			String s = cmd.getCommand(d.SIDE_MENU);
			switch(s) {
			case "1" :
				System.out.println("스낵랩 선택");
				Side cl = new Side();
				cl.name = "스낵랩";
				cl.price = 2200;
				cl.extraDate = "20220824";
				basket.add(cl);
				break;
			case "2" :
				System.out.println("맥너겟 6조각 선택");
				Side mn = new Side();
				mn.name = "맥너겟 6조각";
				mn.price = 3000;
				mn.extraDate = "20220820";
				basket.add(mn);
				break;
			case "3" :
				System.out.println("맥스파이시 치킨 텐더 2조각 선택");
				Side mct = new Side();
				mct.name = "맥스파이시 치킨 텐더 2조각";
				mct.price = 2500;
				mct.extraDate = "20220820";
				basket.add(mct);
				break;
			case "4" :
				System.out.println("맥윙 4조각 선택");
				Side mw = new Side();
				mw.name = "맥윙 4조각";
				mw.price = 5500;
				mw.extraDate = "20220820";
				basket.add(mw);
				break;
			case "5" :
				System.out.println("후렌치 후라이 선택");
				Side ff = new Side();
				ff.name = "후렌치 후라이";
				ff.price = 1700;
				ff.extraDate = "20220810";
				basket.add(ff);
				break;
			case "6" :
				System.out.println("골든 모짜렐라 치즈스틱 선택");
				Side cs = new Side();
				cs.name = "골든 모짜렐라 치즈스틱";
				cs.price = 2200;
				cs.extraDate = "20220818";
				basket.add(cs);
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
