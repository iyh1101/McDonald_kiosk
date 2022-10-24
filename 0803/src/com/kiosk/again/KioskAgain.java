package com.kiosk.again;
import java.util.*;

public class KioskAgain {
	ArrayList<Goods> basket = new ArrayList<>();
	Display d = new Display();
	
	public void kiosk(Food f) {
		d.hello();
		
		xx:
		while(true) {
			Command cmd = new Command();
			String c = cmd.getCommand(d.MENU);
			
		switch(c) {
		case "1" :
			ProcBurger pb = new ProcBurger();
			pb.menu(basket);
			break;
		case "2" :
			ProcDrink pc = new ProcDrink();
			pc.menu(basket);
			break;
		case "3" :
			ProcSide ps = new ProcSide();
			ps.menu(basket);
			break;
		case "4" :
			ProcDessert pd = new ProcDessert();
			pd.menu(basket);
			break;
		case "c" :
			CashMenu ca = new CashMenu();
			ca.cash(basket);
			break;
		case "d" :
			CancelMenu cm = new CancelMenu();
			cm.cancelMenu(basket);
			break;
		case "e" :
			System.out.println("메뉴 안내 종료");
			break xx;
		default :
			d.error();
			break;
		}
		}
	}
}
