package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class SoeyaFortuneTelling implements FortuneTelling{

	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return "天から";
	}

	@Override
	public String getMessage(Result result) {
		// TODO 自動生成されたメソッド・スタブ
		String message = null;
		if (result == Result.DAIKICHI) {
			message = "何をやってもうまくいくのでむしろつまらないかも。 (*^^)v  (幸福度：∞%)";
		} 
		else if (result == Result.KICHI) {
			message = "期待以上の成果を出せるかも！ (*´ω｀)  (幸福度：85%)";
		} 
		else if (result == Result.CHUKICHI) {
			message = "ちょっといいことありそうです。 (｀・ω・´)  (幸福度：65%)";
		} 
		else if (result == Result.SHOKICHI) {
			message = "努力は裏切らないかも！ ('◇')ゞ   (幸福度：45%)";
		} 
		else if (result == Result.SUEKICHI) {
			message = "石橋をたたいて歩くつもりで過ごそう。 (。-`ω-)  (幸福度：20%)";
		} 
		else {
			message = "無理です。運命を甘んじて受け入れましょう。 ( ;∀;)   (幸福度：-273%)";
		}

		return message;
	}

}
