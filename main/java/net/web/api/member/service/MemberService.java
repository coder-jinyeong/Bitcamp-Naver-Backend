/**
 * packageName: net.web.api.member.service
 * fileNa     : MemberService
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


import net.web.api.member.domain.BmiDTO;
import net.web.api.member.domain.CalcDTO;

public interface MemberService {

    String calc(CalcDTO calc);

    String bmi(BmiDTO bmi);
}
