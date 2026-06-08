package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class ShibainuFortuneTelling implements FortuneTelling {
	@Override
    public String getName() {
        return "柴犬";
    }
   
    @Override
    public String getMessage(Result result) {
        String message = null;
        if(result == Result.DAIKICHI) {
            message = "しっぽを降る柴犬。テンションの高い一日になるでしょう。";
        }
        else if(result == Result.KICHI) {
            message = "散歩をする柴犬。楽しい一日になるでしょう。";
        }
        else if(result == Result.CHUKICHI) {
            message = "日向ぼっこをしている柴犬。おだやかな一日になるでしょう。";
        }
        else if(result == Result.SHOKICHI) {
            message = "穴を掘る柴犬。夢中になりすぎに注意。";
        }
        else if(result == Result.SUEKICHI) {
            message = "怯えている柴犬。いやなことがあるかもしれません。";
        }
        else {   
            message = "ほえている柴犬。精神的に不安定な一日になりそう。";
        }
       
        return message;
    }
}
