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
import net.web.api.member.domain.*;
import net.web.api.member.repository.MemberRepository;
import org.springframework.stereotype.Service;
import java.util.Arrays;

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

    @Override
    public String grade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (60 <= avg) ? String.format("합격")
                : String.format("불학격");

        String res = String.format(" * ########## %s ########\n"
                        + " * 이름: %s\n"
                        + " * > 국어: %d점\n"
                        + " * > 영어: %d점\n"
                        + " * > 수학: %d점\n"
                        + " * 총점: %d점\n"
                        + " * 평균(정수): %d점\n"
                        + " * 합격여부: %s\n"
                        + " * #######################",
                GradeDTO.GRADE_TITLE, grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(), total, avg, pass);

        return res ;
    }

    @Override
    public String login(LoginDTO login) {
        String res = String.format("ID : %s, PW : %s, Name : %s",login.getId(), login.getPw(), login.getName() );
        String res1;
        res1 = (login.getPw().equals(LoginDTO.PASSWORD)) ? String.format("\n%s 님의 비번 %s 이 맞습니다. 로그인 성공 ", login.getName(), login.getPw())
                :String.format("\n%s 님의 비번 %s 이 틀립니다. 로그인 실패 ", login.getName(), login.getPw());
        return res + res1;
    }

    @Override
    public String lotto(LottoDTO lotto) {
        String res = "";
        int[] lottonum = new int[6];
        for(int i = 0; i < lotto.getNums(); i++) {
            for (int j = 0; j < 6; j++) {
                lottonum[j] = (int) (Math.random() * 45) + 1;
                for (int k = 0; k < j; k++) {
                    if (lottonum[j] == lottonum[k]) {
                        j--;
                        break;
                    }
                }
            }
            Arrays.sort(lottonum);
            for (int j = 0; j < 6; j++) {
                res += String.format(lottonum[j] + " ");
            }
            res += String.format("\n");
        }
        return res;
    }
}
