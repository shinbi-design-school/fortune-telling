package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class TanakaFortuneTelling implements FortuneTelling {

	@Override
	public String getName() {
		return "田中";
	}

	@Override
	public String getMessage(Result result) {
		String message = null;
		if (result == Result.DAIKICHI) {
			message = "歌って踊りたくなる一日になるでしょう。(今日の歌:「行くぜっ！怪盗少女」)";
		} 
		else if (result == Result.KICHI) {
			message = "猛烈な一日になります。(今日の歌: 「猛烈宇宙交響曲」)";
		} 
		else if (result == Result.CHUKICHI) {
			message = "全力で取り組めば報われるでしょう。(今日の歌: 「全力少女」)";
		} 
		else if (result == Result.SHOKICHI) {
			message = "とにかく目標に向かって突っ走れ！ (今日の歌: 「走れ！」)";
		} 
		else if (result == Result.SUEKICHI) {
			message = "宿題はきちんとやりましょう。(今日の歌: 「ワニとシャンプー」)";
		} 
		else {
			message = "とにかく耐える一日。がんばれ！ (今日の歌: 「泣いてもいいんだよ」)";
		}

		return message;
	}

}
