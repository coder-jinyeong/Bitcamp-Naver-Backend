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


public interface MemberService {
    String MembershipList(); //회원목록
    String MembershipInfo(); //회원정보보기
    String CheckMailingList(); //발송목록보기
    String RegisterSendMails(); //메일발송등록
    String ReserveMoneyList(); //적립금목록
    String CheckDetailSave(); //적립금내역보기
    String calc();
    String grade();
    String bmi();
}
