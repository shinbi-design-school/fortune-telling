package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class UranaiFortuneTelling implements FortuneTelling {
	@Override
    public String getName() {
        return "占い大王";
    }
   
    @Override
    public String getMessage(Result result) {
        String message = null;
        if(result == Result.DAIKICHI) {
            message = "すごくいい幸運日です。楽しくいきましょう！！！";
        }
        else if(result == Result.KICHI) {
            message = "ちょっといい幸運日です。元気にいきましょう！！！";
        }
        else if(result == Result.CHUKICHI) {
            message = "ほどほどの幸運日です。気ままにいきましょう！！！";
        }
        else if(result == Result.SHOKICHI) {
            message = "ほんの少しの幸運日です。がんばっていきましょう！！！";
        }
        else if(result == Result.SUEKICHI) {
            message = "これから訪れる幸運日です。いのりましょう！！！";
        }
        else {   
            message = "運が悪い日です。がんばれ！！！ ";
        }
       
        return message;
    }
}