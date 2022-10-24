package com.kiosk.again;
import java.util.*;

public class ProcBurger {
	Display d = new Display();
	
	public void menu(ArrayList<Goods> basket) {
		loop:
		while(true) {
			Command cmd = new Command();
			String s = cmd.getCommand(d.BURGER_MENU);
			switch(s) {
			case "1" :
				Burger bm = new Burger();
				bm.name = "빅맥";
				bm.extraDate = "20220817";
				System.out.println(bm.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc1 = new Scanner(System.in);
				String yn1 = sc1.next();
				if(yn1.equals("y") ) {
					bm.name = bm.name + " 세트";
					bm.price = 5900;
					basket.add(bm);
					System.out.println(bm.name + " 선택");
					break;
				} else if(yn1.equals("n") ) {
				bm.price = 4600;
				basket.add(bm);
				System.out.println(bm.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "2" :
				Burger ff = new Burger();
				ff.name = "필레 오 피쉬";
				ff.extraDate = "20220817";
				System.out.println(ff.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc2 = new Scanner(System.in);
				String yn2 = sc2.next();
				if(yn2.equals("y") ) {
					ff.name = ff.name + "세트";
					ff.price = 4500;
					basket.add(ff);
					System.out.println(ff.name + " 선택");
					break;
				} else if(yn2.equals("n") ) {
				ff.price = 3500;
				basket.add(ff);
				System.out.println(ff.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "3" :
				Burger df = new Burger();
				df.name = "더블 필레 오 피쉬";
				df.extraDate = "20220817";
				System.out.println(df.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc3 = new Scanner(System.in);
				String yn3 = sc3.next();
				if(yn3.equals("y") ) {
					df.name = df.name + "세트";
					df.price = 6000;
					basket.add(df);
					System.out.println(df.name + " 선택");
					break;
				} else if(yn3.equals("n") ) {
				df.price = 5000;
				basket.add(df);
				System.out.println(df.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "4" :
				Burger ssb = new Burger();
				ssb.name = "맥스파이시 상하이 버거";
				ssb.extraDate = "20220817";
				System.out.println(ssb.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc4 = new Scanner(System.in);
				String yn4 = sc4.next();
				if(yn4.equals("y") ) {
					ssb.name = ssb.name + "세트";
					ssb.price = 5900;
					basket.add(ssb);
					System.out.println(ssb.name + " 선택");
					break;
				} else if(yn4.equals("n") ) {
				ssb.price = 4800;
				basket.add(ssb);
				System.out.println(ssb.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "5" :
				Burger btd = new Burger();
				btd.name = "베이컨 토마토 디럭스";
				btd.extraDate = "20220817";
				System.out.println(btd.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc5 = new Scanner(System.in);
				String yn5 = sc5.next();
				if(yn5.equals("y") ) {
					btd.name = btd.name + "세트";
					btd.price = 7000;
					basket.add(btd);
					System.out.println(btd.name + " 선택");
					break;
				} else if(yn5.equals("n") ) {
				btd.price = 5500;
				basket.add(btd);
				System.out.println(btd.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "6" :
				Burger oob = new Burger();
				oob.name = "1955 버거";
				oob.extraDate = "20220817";
				System.out.println(oob.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc6 = new Scanner(System.in);
				String yn6 = sc6.next();
				if(yn6.equals("y") ) {
					oob.name = oob.name + "세트";
					oob.price = 7200;
					basket.add(oob);
					System.out.println(oob.name + " 선택");
					break;
				} else if(yn6.equals("n") ) {
				oob.price = 5700;
				basket.add(oob);
				System.out.println(oob.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "7" :
				Burger ss = new Burger();
				ss.name = "슈슈 버거";
				ss.extraDate = "20220817";
				System.out.println(ss.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc7 = new Scanner(System.in);
				String yn7 = sc7.next();
				if(yn7.equals("y") ) {
					ss.name = ss.name + "세트";
					ss.price = 5800;
					basket.add(ss);
					System.out.println(ss.name + " 선택");
					break;
				} else if(yn7.equals("n") ) {
				ss.price = 4500;
				basket.add(ss);
				System.out.println(ss.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "8" :
				Burger sb = new Burger();
				sb.name = "슈비 버거";
				sb.extraDate = "20220817";
				System.out.println(sb.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc8 = new Scanner(System.in);
				String yn8 = sc8.next();
				if(yn8.equals("y") ) {
					sb.name = sb.name + "세트";
					sb.price = 7000;
					basket.add(sb);
					System.out.println(sb.name + " 선택");
					break;
				} else if(yn8.equals("n") ) {
				sb.price = 5500;
				basket.add(sb);
				System.out.println(sb.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "9" :
				Burger mc = new Burger();
				mc.name = "맥치킨";
				mc.extraDate = "20220817";
				System.out.println(mc.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc9 = new Scanner(System.in);
				String yn9 = sc9.next();
				if(yn9.equals("y") ) {
					mc.name = mc.name + "세트";
					mc.price = 4500;
					basket.add(mc);
					System.out.println(mc.name + " 선택");
					break;
				} else if(yn9.equals("n") ) {
				mc.price = 3300;
				basket.add(mc);
				System.out.println(mc.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "10" :
				Burger cm = new Burger();
				cm.name = "맥치킨 모짜렐라";
				cm.extraDate = "20220817";
				System.out.println(cm.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc10 = new Scanner(System.in);
				String yn10 = sc10.next();
				if(yn10.equals("y") ) {
					cm.name = cm.name + "세트";
					cm.price = 6500;
					basket.add(cm);
					System.out.println(cm.name + " 선택");
					break;
				} else if(yn10.equals("n") ) {
					cm.price = 4800;
					basket.add(cm);
				System.out.println(cm.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "11" :
				Burger qc = new Burger();
				qc.name = "쿼터파운더 치즈 ";
				qc.extraDate = "20220817";
				System.out.println(qc.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc11 = new Scanner(System.in);
				String yn11 = sc11.next();
				if(yn11.equals("y") ) {
					qc.name = qc.name + "세트";
					qc.price = 6900;
					basket.add(qc);
					System.out.println(qc.name + " 선택");
					break;
				} else if(yn11.equals("n") ) {
				qc.price = 5200;
				basket.add(qc);
				System.out.println(qc.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "12" :
				Burger dq = new Burger();
				dq.name = "더블 쿼터파운더 치즈 ";
				dq.extraDate = "20220817";
				System.out.println(dq.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc12 = new Scanner(System.in);
				String yn12 = sc12.next();
				if(yn12.equals("y") ) {
					dq.name = dq.name + "세트";
					dq.price = 8400;
					basket.add(dq);
					System.out.println(dq.name + " 선택");
					break;
				} else if(yn12.equals("n") ) {
					dq.price = 7000;
					basket.add(dq);
				System.out.println(dq.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "13" :
				Burger cb = new Burger();
				cb.name = "치즈 버거";
				cb.extraDate = "20220817";
				System.out.println(cb.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc13 = new Scanner(System.in);
				String yn13 = sc13.next();
				if(yn13.equals("y") ) {
					cb.name = cb.name + "세트";
					cb.price = 4500;
					basket.add(cb);
					System.out.println(cb.name + " 선택");
					break;
				} else if(yn13.equals("n") ) {
				cb.price = 2300;
				basket.add(cb);
				System.out.println(cb.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "14" :
				Burger dc = new Burger();
				dc.name = "더블치즈 버거";
				dc.extraDate = "20220817";
				System.out.println(dc.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc14 = new Scanner(System.in);
				String yn14 = sc14.next();
				if(yn14.equals("y") ) {
					dc.name = dc.name + "세트";
					dc.price = 5700;
					basket.add(dc);
					System.out.println(dc.name + " 선택");
					break;
				} else if(yn14.equals("n") ) {
					dc.price = 4400;
				basket.add(dc);
				System.out.println(dc.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "15" :
				Burger bb = new Burger();
				bb.name = "불고기 버거";
				bb.extraDate = "20220817";
				System.out.println(bb.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc15 = new Scanner(System.in);
				String yn15 = sc15.next();
				if(yn15.equals("y") ) {
					bb.name = bb.name + "세트";
					bb.price = 4300;
					basket.add(bb);
					System.out.println(bb.name + " 선택");
					break;
				} else if(yn15.equals("n") ) {
					bb.price = 2300;
					basket.add(bb);
				System.out.println(bb.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "16" :
				Burger db = new Burger();
				db.name = "더블 불고기 버거";
				db.extraDate = "20220817";
				System.out.println(db.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc16 = new Scanner(System.in);
				String yn16 = sc16.next();
				if(yn16.equals("y") ) {
					db.name = db.name + "세트";
					db.price = 5700;
					basket.add(db);
					System.out.println(db.name + " 선택");
					break;
				} else if(yn16.equals("n") ) {
					db.price = 4400;
					basket.add(db);
				System.out.println(db.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "17" :
				Burger eb = new Burger();
				eb.name = "에그 불고기 버거";
				eb.extraDate = "20220817";
				System.out.println(eb.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc17 = new Scanner(System.in);
				String yn17 = sc17.next();
				if(yn17.equals("y") ) {
					eb.name = eb.name + "세트";
					eb.price = 4600;
					basket.add(eb);
					System.out.println(eb.name + " 선택");
					break;
				} else if(yn17.equals("n") ) {
				eb.price = 3200;
				basket.add(eb);
				System.out.println(eb.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
			case "18" :
				Burger hb = new Burger();
				hb.name = "햄버거";
				hb.extraDate = "20220817";
				hb.price = 2000;
				basket.add(hb);
				System.out.println(hb.name + " 선택");
				break;
			case "19" :
				Burger tc = new Burger();
				tc.name = "트리플 치즈버거";
				tc.extraDate = "20220817";
				System.out.println(tc.name + " 선택");
				System.out.println("세트로 드실래요? [ y / n ]");
				Scanner sc19 = new Scanner(System.in);
				String yn19 = sc19.next();
				if(yn19.equals("y") ) {
					tc.name = tc.name + "세트";
					tc.price = 6900;
					basket.add(tc);
					System.out.println(tc.name + " 선택");
					break;
				} else if(yn19.equals("n") ) {
				tc.price = 5600;
				basket.add(tc);
				System.out.println(tc.name + " 단품 선택");
				break; }
				else {
					d.cMenu();
					break;
				}
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