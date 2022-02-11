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

import net.web.api.member.domain.MemberDTO;

public interface MemberService {
    String MembershopList(MemberDTO member); //회원목록
    String MembershipInfo(MemberDTO member); //회원정보보기
    String CheckMailingList(MemberDTO member); //발송목록보기
    String RegisterSendMails(MemberDTO member); //메일발송등록
    String ReserveMoneyList(MemberDTO member); //적립금목록
    String CheckDetailSave(MemberDTO member); //적립금내역보기
}
