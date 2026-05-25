package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class ShinbiFortuneTelling implements FortuneTelling {
	@Override
    public String getName() {
        return "シンビ先生";
    }
   
    @Override
    public String getMessage(Result result) {
        String message = null;
        if(result == Result.DAIKICHI) {
            message = "とても Well-being な一日になるでしょう。";
        }
        else if(result == Result.KICHI) {
            message = "やや Well-being な一日になるでしょう。";
        }
        else if(result == Result.CHUKICHI) {
            message = "ちょっとだけ Well-being な一日になるでしょう。";
        }
        else if(result == Result.SHOKICHI) {
            message = "何かは Well-being な一日になるでしょう。";
        }
        else if(result == Result.SUEKICHI) {
            message = "かすかに Well-being な一日になるでしょう。";
        }
        else {   
            message = "Well-being と無縁な一日になるでしょう。";
        }
       
        return message;
    }
}
