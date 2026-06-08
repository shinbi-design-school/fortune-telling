package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class Osakana implements FortuneTelling {
	@Override
    public String getName() {
        return "さかなサン";
    }
   
    @Override
    public String getMessage(Result result) {
        String message = null;
        if(result == Result.DAIKICHI) {
            message = "クロマグロ！とまらずにつきすすみましょ～！";
        }
        else if(result == Result.KICHI) {
            message = "ハマチがつれました！ブリみたいに出世できるかもです！";
        }
        else if(result == Result.CHUKICHI) {
            message = "カサゴですね！毒はありますがおいしい高級魚です！";
        }
        else if(result == Result.SHOKICHI) {
            message = "アジですねぇ！ぜひフライで！";
        }
        else if(result == Result.SUEKICHI) {
            message = "アカエイです！しっぽに気を付けて！";
        }
        else {   
            message = "ざんねん！根がかりしちゃいましたね…";
        }
       
        return message;
    }
}
