package com.kiosk.again;
import java.util.*;

public class CancelMenu {
	Display d = new Display();
	
	public void cancelMenu(ArrayList<Goods> basket) {
		
		loop:
		while(true) {
			if(basket.size() == 0) {
				System.out.println("취소할 메뉴가 없습니다");
				break loop;
			}
			for(int i = 1; i < basket.size() + 1; i++) {
				System.out.println(i + "번 " + basket.get(i-1).name);
			}
			
			Command cmd = new Command();
			String str = cmd.getCommand(d.CANCEL_MENU);
			
			if(str.equals("b") ) {
				d.backMenu();
				break loop;
			}
			else {
			//str로 입력받은걸 받아옴
			try {
				int n = Integer.parseInt(str);
				if(1 <= n && n <= basket.size()) {
					basket.remove(n-1);
					System.out.println("취소완료");
					break loop;
					}
				else {
					d.error();
				}
			} catch(Exception e) {
//				e.printStackTrace();
				d.error();
				}
			} //else	
		} //while
	} //메인함수
}