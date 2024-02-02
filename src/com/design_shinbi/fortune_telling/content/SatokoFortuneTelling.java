package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class SatokoFortuneTelling implements FortuneTelling{

	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return "satton(GPT3.5)";
	}

	@Override
	public String getMessage(Result result) {
		// TODO 自動生成されたメソッド・スタブ
		String message = null;
		if (result == Result.DAIKICHI) {
			message = "「今日は大吉！幸せな予感が広がります。笑顔で過ごし、素敵な瞬間を楽しんでください！」(今日の歌:「奏（かなで）」)";
		} 
		else if (result == Result.KICHI) {
			message = "「吉！穏やかな日々が続く幸運。チャンスに恵まれ、良い流れを感じましょう。」(今日の歌: 「ハチミツ」)";
		} 
		else if (result == Result.CHUKICHI) {
			message = "「中吉！安定感と期待が広がります。今日は良い出来事に恵まれそうです。」(今日の歌: 「馬と鹿」)";
		} 
		else if (result == Result.SHOKICHI) {
			message = "「小吉！控えめな幸運が巡ってきます。微笑ましい出来事に期待しましょう。」 (今日の歌: 「ありがとう」)";
		} 
		else if (result == Result.SUEKICHI) {
			message = "「末吉。運勢は落ち着いていますが、良いこともあります。慎重に過ごしましょう。」(今日の歌: 「全力少年」)";
		} 
		else {
			message = "「凶。注意が必要な一日です。油断せず慎重に行動しましょう。明日に期待しましょう。」 (今日の歌: 「カルマ」)";
		}

		return message;	

	}


}


