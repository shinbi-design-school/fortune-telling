package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class BloodFortuneTelling implements FortuneTelling {
	@Override
    public String getName() {
        return "血液占い先生";
    }
   
    @Override
    public String getMessage(Result result) {
        String message = null;
        if(result == Result.DAIKICHI) {
            message = "O型のあなたは今までにない最高な日になるでしょう。";
        }
        else if(result == Result.KICHI) {
            message = "A型のあなたは100円玉を拾うでしょう。";
        }
        else if(result == Result.CHUKICHI) {
            message = "B型のあなたは特になにも無いでしょう。";
        }
        else if(result == Result.SHOKICHI) {
            message = "AB型のあなたは段差でつまづくでしょう。";
        }
        else if(result == Result.SUEKICHI) {
            message = "B型のあなたは家の鍵を忘れるでしょう。";
        }
        else {   
            message = "O型のあなたは車のバッテリーが上がるでしょう。";
        }
       
        return message;
    }
}
