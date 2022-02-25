/**
 * packageName: net.web.api.member.service
 * fileNa     : MemberSerivceImpl
 * au         : kimjinyeong
 * date       : 2022-02-11
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         kimjinyeong    최초 생성
 */

package net.web.api.member.service;

import lombok.RequiredArgsConstructor;
import net.web.api.member.domain.BmiDTO;
import net.web.api.member.domain.CalcDTO;
import net.web.api.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberSerivceImpl implements MemberService{
    private final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
        switch (op){
            case"+" : res = a + b; break;
            case"-" : res = a + b; break;
            case"*" : res = a + b; break;
            case"/" : res = a + b; break;
            case"%" : res = a + b; break;
        }
        return String.format("%d %s %d = %d", a, op, b, res);
    }

    @Override
    public String bmi(BmiDTO bmi) {
        double m = bmi.getHeight() / 100;
        double sum = bmi.getWeight() / (m * m);
        String sum2;
        if(sum < 18.5){
            sum2 = "저체중";
        }
        else if(18.5 <= sum && sum <  22.9){
            sum2 = "정상";
        }
        else if(23 < sum && sum < 24.9){
            sum2 = "과체중";
        }
        else{
            sum2 = "비만";
        }
        return String.format("%s 님의 BMI 지수 : % .2f\n%s 님은 %s 입니다.",bmi.getName(), sum, bmi.getName(),sum2);
    }
}
