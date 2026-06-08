package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class SeizaUranai implements FortuneTelling {
	@Override
    public String getName() {
        return "均先生";
    }
   
    @Override
    public String getMessage(Result result) {
        String message = null;
        if(result == Result.DAIKICHI) {
            message = "いて座です。大変幸運です。均先生の星座です。";
        }
        else if(result == Result.KICHI) {
            message = "さそり座です。これまた幸運です。さそりの女性に巡り合えます。";
        }
        else if(result == Result.CHUKICHI) {
            message = "はくちょう座です。明るい明日に向かって何にでも挑戦してください。";
        }
        else if(result == Result.SHOKICHI) {
            message = "オリオン座です。勉強が進みます。均先生が最初に覚えた星座です。";
        }
        else if(result == Result.SUEKICHI) {
            message = "こぐま座です。小熊に遭遇しないよう気を付けてください。";
        }
        else if(result == Result.KYOU) {
            message = "おおぐま座です。熊に遭遇するかもしれません。外出は避けましょう";
        }
        else {   
            message = "気合を入れて明日の活力をためましょう";
        }
       
        return message;
    }
}
