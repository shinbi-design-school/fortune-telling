package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class Kumauranai implements FortuneTelling {
	
	@Override
	public String getName() {
		return "クマ遭遇占い";
	}

	@Override
	public String getMessage(Result result) {

		if (result == null) {
			return "占いの結果が取得できませんでした。山に入る際は十分に注意してくださいね。";
		}

		switch (result) {
		case DAIKICHI: // 大吉
			return "【熊遭遇度：なし (0%)】\n" +
					"今日は絶対に熊に出会わないよ！安心して自然を満喫しよう！。(⋈◍＞◡＜◍)";

		case KICHI: // 吉
			return "【熊遭遇度：低 (10%)】\n" +
					"基本的には安全な一日だよ！。念のため、周囲の音に少しだけ耳を傾けてみてね！。";

		case CHUKICHI: // 中吉
			return "【熊遭遇度：中 (30%)】\n" +
					"熊の活動エリアに近づいているかも・・・。荷物に熊鈴やラジオを装備しておくといいかも・・・。";

		case SHOKICHI: // 小吉
			return "【熊遭遇度：高 (60%)】\n" +
					"遭遇確率が高まっています！もしガサゴソ音がしても、大声を出したり走って逃げたりしないでね！。";

		case SUEKICHI: // 末吉
			return "【熊遭遇度：極高 (80%)】\n" +
					"すぐ近くにクマ気配を感じるよ。万が一遭遇した場合は、目をそらさず、慌てずゆっくりと後退しようね。";

		default: // 大凶（KYO）など
			return "【熊遭遇度：MAX (100%)】\n" +
					"ついにクマと至近距離で遭遇してしまいました！突進に備え、うつ伏せになり首の後ろをガードして命を守ろう！幸運を祈る。";

		}
	}

}
