package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class ChikaFortuneTelling implements FortuneTelling {

	@Override
	public String getName() {
		return "Chika";
	}

	@Override
	public String getMessage(Result result) {
		String message = null;
		if (result == Result.DAIKICHI) {
			message = "今日は何をしてもうまくいく！宝くじを買いに行こ～";
		} 
		else if (result == Result.KICHI) {
			message = "いつもよりちょっといい日になりそう。お出かけするともっと運気があがるかも⤴⤴";
		} 
		else if (result == Result.CHUKICHI) {
			message = "いつもと変わらない普通の日。あたりまえに感謝していつも通り過ごそう。";
		} 
		else if (result == Result.SHOKICHI) {
			message = "ちょっとブルーな日。小さな段差に気を付けて!!";
		} 
		else if (result == Result.SUEKICHI) {
			message = "トラブルに巻き込まれるかも…。知らない人には付いていかないで！";
		} 
		else {
			message = "今日は何をしてもだめ！学校も会社も休んじゃお★";
		}

		return message;
	}

}
