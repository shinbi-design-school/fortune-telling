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
        if(result == Result.ITE) {
            message = "大変幸運です。均先生の星座です。";
        }
        else if(result == Result.SASORI) {
            message = "女性に気を付けてください。特にさそり座の女性には。";
        }
        else if(result == Result.HAKUTYO) {
            message = "明るい明日がまっています。大空に向けて羽ばたこう。";
        }
        else {   
            message = "なにかきっかけをみつけましょう。";
        }
       
        return message;
    }
}
