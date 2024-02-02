package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class yuniFortuneTelling implements FortuneTelling {

	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return "松本";
	}

	@Override
	public String getMessage(Result result) {
		String message = null;
		if (result == Result.DAIKICHI) {
			message = "宝くじを買ってみましょう";
		} 
		else if (result == Result.KICHI) {
			message = "やりたかったことができるかも";
		} 
		else if (result == Result.CHUKICHI) {
			message = "おやつを分けてもらえるかも";
		} 
		else if (result == Result.SHOKICHI) {
			message = "忘れていたことを思い出せる日";
		} 
		else if (result == Result.SUEKICHI) {
			message = "一日一善";
		} 
		else {
			message = "今日は美味しいものを食べましょう";
		}

		return message;

	}

}
