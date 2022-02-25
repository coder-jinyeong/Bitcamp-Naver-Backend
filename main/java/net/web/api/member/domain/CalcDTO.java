/**
 * packageName: net.web.api.member.domain
 * fileNa     : CalcDTO
 * au         : kimjinyeong
 * date       : 2022-02-25
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-25         kimjinyeong    최초 생성
 */

package net.web.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CalcDTO {
    private int num1;
    private int num2;
    private String opcode;
}
