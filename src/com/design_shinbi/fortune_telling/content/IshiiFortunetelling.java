package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class IshiiFortunetelling implements FortuneTelling {

	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return "石井";
	}

	@Override
	public String getMessage(Result result) {
		// TODO 自動生成されたメソッド・スタブ
		String message = null;
		if (result == Result.DAIKICHI) {
			message = "今日は大きい良いことがいっぱいの1日になるかも！おめでとう!!皆にも幸せを渡して行こう！！(今日の歌: FLOW「GO!!」)";
		} 
		else if (result == Result.KICHI) {
			message = "今日はいつもより少し良いことあるかも！見逃さないで！！(今日の歌: Aimer「SPARK-AGAIN」)";
		} 
		else if (result == Result.CHUKICHI) {
			message = "いつも通りの日に胸を張ってみたらいいことあるかも！！(今日の歌: 寺田拓鷲「Nameless Story」)";
		} 
		else if (result == Result.SHOKICHI) {
			message = "末吉回避！！挨拶をすると小さい良いことがたくさん見つかるかも！！ (今日の歌: mu-ray「サンキュー！！」)";
		} 
		else if (result == Result.SUEKICHI) {
			message = "今日はつまずいちゃう1日かもだけど気にしないでちょっとずつ進んで行こう！！(今日の歌: JUDY AND MARY「そばかす」)";
		} 
		else {
			message = "辛いことがあっても良いことに変えていこう！！ (今日の歌: T-Pistonz✛KMC「勝って泣こうぜ！」)";
		}

		return message;
		
	}

}
