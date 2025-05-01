package chapter10.interface_part;

import java.util.Scanner;

public class GameMain_Method {
	Novice char1;
	
	Scanner scan = new Scanner(System.in);
	
	public void printMenu() {
		
			System.out.println("=== ABCDE_rpg ===");
			System.out.println("1. 캐릭터 생성");
			System.out.println("2. 캐릭터 정보");
			System.out.println("3. 전직하기");
			System.out.println("4. 기본 공격");
			System.out.println("5. 스킬 사용");
			System.out.println("0. 종료");
			System.out.println("=================");
			System.out.println("번호를 선택하세요 : ");
	}
	
	public void showInfo() {
		System.out.println("[ID: " + char1.getName() + " stat: 힘(" + char1.getStrength() 
				 + "), 민첩(" + char1.getDexterity() + "), 지능(" + char1.getIntelligence() + ")");
	}
	public void characterGenerate() {
		
		System.out.println("캐릭터를 생성합니다.");
		System.out.println("사용하실 아이디를 입력해 주세요.");
		String name = scan.next();
		int str, dex, intel = 0;
		
		for (int i = 0; i < 1; i++) {
		
		str = (int) (Math.random() * 10);
		dex = (int) (Math.random() * 10);
		intel = (int) (Math.random() * 10);
		
		 if(str + dex + intel <16) {
			i--;
		 	continue;}
		 
		 System.out.println("힘[" + str + "], 민첩[" + dex + "], 지능[" + intel + "]");	 
		 System.out.println("스탯을 다시 부여하시겠습니까? (y/n)");
		 
		 String reroll = scan.next();
		 if(reroll.equals("y")) {
			 i--;
			 System.out.println("스탯을 부여합니다.");
			 continue;
		 } 
		 char1 = new Novice(name, str, dex, intel);
		 System.out.println("[ID: " + name + " stat: 힘(" + str 
				 + "), 민첩(" + dex + "), 지능(" + intel + ")");
		 System.out.println("현재 정보로 저장합니다.");
		 System.out.println();
		}
		
	}
	public void action() {
		char1.attack();
	}
	
	public void skil() {
		char1.skil();
	}
	public void changeJob() {
		System.out.println("=== 직업 종류 ===");
		System.out.println("1. 기사");
		System.out.println("2. 마법사");
		System.out.println("3. 도적");
		System.out.println("전직할 직업의 번호를 선택하세요.");
		
		int num = scan.nextInt();
		switch(num) {
			case 1 :
			char1 = new Knight(char1.getName(), char1.getStrength(), char1.getDexterity(), char1.getIntelligence());
			System.out.println("기사로 전직합니다.");
			break;
			case 2: 
			char1 = new Magician(char1.getName(), char1.getStrength(), char1.getDexterity(), char1.getIntelligence());
			System.out.println("마법사로 전직합니다.");
			break;
			case 3 :
			char1 = new Thief(char1.getName(), char1.getStrength(), char1.getDexterity(), char1.getIntelligence());
			System.out.println("도적으로 전직합니다.");
			break;
		}
		
	}
}
