/**
 * packageName: net.web.api.member.domain
 * fileNa     : MemberDTD
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

package net.web.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data //게터세터
@Component // 싱글턴
public class MemberDTO {
    private String userid;
    private String username;
    private int menNumber;
    private String addr;
    private String phone1;
    private String phone2;
    private double height;
    private double weight;
    private String debutDate;


}
