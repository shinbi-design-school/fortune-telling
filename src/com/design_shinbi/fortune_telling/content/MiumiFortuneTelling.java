package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class MiumiFortuneTelling implements FortuneTelling{

	@Override
	public String getName() {
		return "美海";
	}

	@Override
	public String getMessage(Result result) {
		String message = null;
		if (result == Result.DAIKICHI) {
			message = "勇気です、勇気を出すのです。人より目立つためには勇気がいるのですよ。(笑ゥせぇるすまん第6話「勇気は損気」より)";
		} 
		else if (result == Result.KICHI) {
			message = "百回の練習より、一回の実戦です。 (笑ゥせぇるすまん第12話「ゴルフ入門」より)";
		} 
		else if (result == Result.CHUKICHI) {
			message = "どうして、なぜ、なんて考えていられるほど人生長くありませんよ。(笑ゥせぇるすまん第99話「夜行列車」より)";
		} 
		else if (result == Result.SHOKICHI) {
			message = "多少のストレスは人生の調味料だと思いますよ。 (笑ゥせぇるすまん第79話「日曜クラブ」より)";
		} 
		else if (result == Result.SUEKICHI) {
			message = "夢は夢だからいいのです。人はみな、現実の厳しさの中で生きねばなりません。 (笑ゥせぇるすまん第122話「邯鄲の夢枕」より)";
		} 
		else {
			message = "失った愛は、新しい愛で埋めるしかありませんな。 (笑ゥせぇるすまん第38話「カンヅメのペット」より)";
		}

		return message;
	}

}
