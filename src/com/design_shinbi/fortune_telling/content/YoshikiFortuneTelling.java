package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class YoshikiFortuneTelling implements FortuneTelling {

	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return "祥輝";
	}

	@Override
	public String getMessage(Result result) {
		
		String message = null;
		if (result == Result.DAIKICHI) {
			message = "歌って騒ぎたくなる一日になるでしょう。(今日の歌:「ONE OK ROCK  Mad World」)";
		} 
		else if (result == Result.KICHI) {
			message = "猛烈に踊りたくなるでしょう。(今日の歌: 「ONE OK ROCK  完全感覚Dreamer」)";
		} 
		else if (result == Result.CHUKICHI) {
			message = "狂おしいほどに全力で取り組めば報われるでしょう。(今日の歌: 「ONE OK ROCK  The Beginning」)";
		} 
		else if (result == Result.SHOKICHI) {
			message = "自分らしくありのままでいればチャンスを掴めるでしょう。 (今日の歌: 「ONE OK ROCK  Stand Out Fit In」)";
		} 
		else if (result == Result.SUEKICHI) {
			message = "信頼できる仲間を見つけよう。(今日の歌: 「ONE OK ROCK  We　Are」)";
		} 
		else {
			message = "不可能だと思わないで諦めないで踏ん張ろう。 (今日の歌: 「ONE OK ROCK  Renegades」)";
		}

		return message;
	}
	
}
