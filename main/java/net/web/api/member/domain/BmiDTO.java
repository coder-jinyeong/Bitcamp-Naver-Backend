/**
 * packageName: net.web.api.member.domain
 * fileNa     : BmiDTO
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
public class BmiDTO {
    private String name;
    private double weight;
    private double height;
}
