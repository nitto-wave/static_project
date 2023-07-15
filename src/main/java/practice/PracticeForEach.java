package practice;

import java.util.ArrayList;
import java.util.List;

//task04
public class PracticeForEach {

	public static void  PracticeForEach() {
		
		List<String> list = new ArrayList<>();
		list.add("江藤");
		list.add("栄");
		list.add("笠原");
		list.add("横山");
		list.add("安倍");
		list.add("伊藤");
		list.add("浦川");
		list.add("犬山");
		list.add("古庄");
		list.add("溝上");
		
		// list関数内の名前を取得し、上から順に全部出力
		for(String str: list) {
			System.out.println(str);
		}
	}
}
