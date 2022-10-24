package com.kiosk.again;

public class Display {
	public static final String HELLO = "반갑습니다 맥드날드입니다";
	public static final String MENU = "메인메뉴 1.햄버거 2.음료 3.사이드 4.디저트 c.계산하기 d.메뉴취소 e.종료";
	public static final String BURGER_MENU = "[ 1.빅맥 2.필레 오 피쉬 3.더블 필레 오 피쉬 4.맥스파이시 상하이 버거 5.베이컨 토마토 디럭스 6.1955 버거 \n"
			+ "7.슈슈버거 8.슈비버거 9.맥치킨 10.맥치킨 모짜렐라 11.쿼터파운더 치즈 12.더블 쿼터파운더 치즈 13.치즈버거 \n14.더블치즈버거 15.불고기 버거 16.더블 불고기 버거 17.에그 불고기 버거 18.햄버거 19.트리플 치즈버거 b.뒤로가기 ]";
	public static final String ERROR = "잘못입력하셨습니다";
	public static final String DRINK_MENU ="1.콜라 2.사이다 3.환타 4.주스 5.아메리카노 6.밀크쉐이크 b.뒤로가기";
	public static final String DESSERT_MENU ="1.아이스크림 콘 2.초코콘 3.맥플러리 4.오레오 아포가토 5.선데이 아이스크림 6.밀크쉐이크 7.칠러 8.애플파이 9.츄러스 b.뒤로가기";
	public static final String SIDE_MENU ="1.스낵랩 2.맥너겟 6조각 3.맥스파이시 치킨 텐더 2조각 4.맥윙 4조각 5.후렌치 후라이 6.골든 모짜렐라 치즈스틱 b.뒤로가기";
	public static final String CANCEL_MENU = "취소하실 메뉴의 번호를 눌러주세요 b.뒤로가기";
	public static final String BACK_MENU = "메인메뉴로 돌아갑니다";
	public static final String C_MENU = "세트여부를 선택하지 않아 메뉴를 취소합니다";
	public static final String NO_MENU = "계산하실 메뉴가 없습니다";
	public static final String HOW_CASH = "카드결제를 위해 단말기에 카드를 넣어주세요";
	
	public void hello() {
		System.out.println(HELLO);
	}
	public void error() {
		System.out.println(ERROR);
	}
	public void backMenu() {
		System.out.println(BACK_MENU);
	}
	public void cMenu() {
		System.out.println(C_MENU);
	}
	public void noMenu() {
		System.out.println(NO_MENU);
	}
	public void cash() {
		System.out.println(HOW_CASH);
	}
	
}
