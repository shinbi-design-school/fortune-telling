package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class MugichaFortuneTelling implements FortuneTelling {
	@Override
    public String getName() {
        return "フクちゃん先生";
    }
   
    @Override
    public String getMessage(Result result) {
        String message = null;
        if(result == Result.DAIKICHI) {
            message = "おいしい何かにであえるかもしれません！";
        }
        else if(result == Result.KICHI) {
            message = "欲しかったものが見つかるかもしれませんよ…！";
        }
        else if(result == Result.CHUKICHI) {
            message = "思わぬプレゼントが！？";
        }
        else if(result == Result.SHOKICHI) {
            message = "いつもとあんまりかわらないかもしれませんね";
        }
        else if(result == Result.SUEKICHI) {
            message = "少し負け越すかもしれませんね…";
        }
        else {   
            message = "ぼっこぼこにされちゃうかもです…";
        }
       
        return message;
    }
}
