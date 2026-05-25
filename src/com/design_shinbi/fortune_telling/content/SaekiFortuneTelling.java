package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class SaekiFortuneTelling implements FortuneTelling {
	@Override
    public String getName() {
        return "さえき先生";
    }
   
    @Override
    public String getMessage(Result result) {
        String message = null;
        if(result == Result.DAIKICHI) {
            message = "とても素敵な日になるでしょう。";
        }
        else if(result == Result.KICHI) {
            message = "すこし素敵な日になるでしょう。";
        }
        else if(result == Result.CHUKICHI) {
            message = "ちょっと素敵な日になるでしょう。";
        }
        else if(result == Result.SHOKICHI) {
            message = "わずかに素敵な日になるでしょう。";
        }
        else if(result == Result.SUEKICHI) {
            message = "普通な日になるでしょう。";
        }
        else {   
            message = "災厄が降り注ぐでしょう。";
        }
       
        return message;
    }
}
