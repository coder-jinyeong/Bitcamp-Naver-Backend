/**
 * packageName: net.web.api.member.domain
 * fileNa     : LottoDTO
 * au         : kimjinyeong
 * date       : 2022-02-26
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-26         kimjinyeong    최초 생성
 */

package net.web.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class LottoDTO {
    private int nums;
}
