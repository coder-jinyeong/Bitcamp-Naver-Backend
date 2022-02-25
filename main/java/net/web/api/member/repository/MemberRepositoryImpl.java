/**
 * packageName: net.web.api.member.repository
 * fileNa     : MemberRepositoryImpl
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

package net.web.api.member.repository;

import net.web.api.member.domain.BmiDTO;
import net.web.api.member.domain.CalcDTO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepositoryImpl implements MemberRepository{
    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String bmi(BmiDTO bmi) {return null;}
}
