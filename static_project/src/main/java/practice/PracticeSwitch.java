package practice;

import java.util.Random;

// task06
public class PracticeSwitch {
	
	public static void PracticeSwitch() {
		
		int[] array = new int[10];
		Random rand = new Random();

		//		ランダムな数を配列に格納
		for (int i = 0; i < array.length; i++) {
			
			array[i] = 1 + rand.nextInt(5); // 1から5までのランダムな数
		}

		// 配列をループしてジョブを出力
		for (int i = 0; i < array.length; i++) {
			
			switch (array[i]) {
			
			case 1:
				System.out.println("勇者");
				break;
				
			case 2:
				System.out.println("バトルマスター");
				break;
				
			case 3:
				System.out.println("パラディン");
				break;
				
			case 4:
				System.out.println("海賊");
				break;
				
			case 5:
				System.out.println("魔法剣士");
				break;
			}
		}
	}
}
