package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class YasudaFortuneTelling  implements FortuneTelling {
	@Override
    public String getName() {
        return "均先生";
    }
   
    @Override
    public String getMessage(Result result) {
        String message = null;
        if(result == Result.DAIKICHI) {
            message = "何を打っても当たるでしょう。(今日の歌:軍艦マーチ)";
        }
        else if(result == Result.KICHI) {
            message = "面が絶好調です。(今日の歌: 同期の桜)";
        }
        else if(result == Result.CHUKICHI) {
            message = "小手か胴が当たるかな。(今日の歌: 武田節)";
        }
        else if(result == Result.SHOKICHI) {
            message = "引き分けで順当 (今日の歌: 戦友)";
        }
        else if(result == Result.SUEKICHI) {
            message = "なんとか１本負けに抑えましょう(今日の歌: トムとジェリー)";
        }
        else {   
            message = "頑張るのみ。天皇陛下万歳！ (今日の歌: 君が代)";
        }
       
        return message;
    }
}
