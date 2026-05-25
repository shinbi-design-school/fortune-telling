package com.design_shinbi.fortune_telling.content;

import com.design_shinbi.fortune_telling.FortuneTelling;
import com.design_shinbi.fortune_telling.Result;

public class AraiFortuneTelling  implements FortuneTelling {
	@Override
    public String getName() {
        return "エドワード・エルリック";
    }
   
    @Override
    public String getMessage(Result result) {
        String message = null;
        if(result == Result.DAIKICHI) {
            message = "「等価交換だ！俺の人生半分やるからおまえの人生半分くれ！」(FA版 第64話「旅路の涯」（最終話）)";
        }
        else if(result == Result.KICHI) {
            message = "「痛みを伴わない教訓には意義がない。人は何かの犠牲なしには何も得ることにはできないのだから」(FA版 第2話「はじまりの日」)";
        }
        else if(result == Result.CHUKICHI) {
            message = "「降りて来いよド三流！格の違いってやつを見せてやる！」(FA版 第3話「邪教の街」)";
        }
        else if(result == Result.SHOKICHI) {
            message = "「悪党とは等価交換の必要無し！！」(FA版 第13話「ダブリスの獣たち」)";
        }
        else if(result == Result.SUEKICHI) {
            message = "「だれが豆つぶドチビかーーーッ！！」(複数話)";
        }
        else {   
            message = "「死んだ人間はどんな事をしても元に戻らない これは真理だ」(FA版 第2話「はじまりの日」)";
        }
       
        return message;
    }
}
