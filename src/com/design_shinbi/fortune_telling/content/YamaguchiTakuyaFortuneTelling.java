package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class YamaguchiTakuyaFortuneTelling implements FortuneTelling {

	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return "山口";
	}

	@Override
	public String getMessage(Result result) {
		// TODO 自動生成されたメソッド・スタブ
		String message = null;
		if (result == Result.DAIKICHI) {
			message = "今日は絶好調新しいことに挑戦しましょう(ラッキーアイテム：赤い手袋)";
		} 
		else if (result == Result.KICHI) {
			message = "今日はいつも通り過ごしましょう(ラッキーアイテム：青い傘)";
		} 
		else if (result == Result.CHUKICHI) {
			message = "今日はいつもより慎重に(ラッキーアイテム：緑のハンカチ)";
		} 
		else if (result == Result.SHOKICHI) {
			message = "今日は無理せず早めに休みましょう(ラッキーアイテム：黄色のTシャツ)";
		} 
		else if (result == Result.SUEKICHI) {
			message = "予定の確認はしっかりと行いましょう(ラッキーアイテム：茶色の手帳)";
		} 
		else {
			message = "問題が起きても慌てず対処 (ラッキーアイテム：紺色のペンケース)";
		}

		return message;
	}

}
