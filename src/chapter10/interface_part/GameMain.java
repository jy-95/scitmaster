package chapter10.interface_part;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		GameMain_Method gm = new GameMain_Method();
		
		while(true) {
		gm.printMenu();
		int num = scan.nextInt();
		
		switch(num) {
			case 1: 
				gm.characterGenerate();
				break;
			case 2:
				gm.showInfo();
				break;
			case 3:
				gm.changeJob();
				break;
			case 4:
				gm.action();
				break;
			case 5:
				gm.skil();
				break;
			case 0:
				return;
			}		
		}
	}

}
