/**
 * packageName: net.web.api.member.domain
 * fileNa     : GreadeDTO
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
public class GradeDTO {
    public static String GRADE_TITLE = "성적표";

    private String name;
    private int kor;
    private int eng;
    private int math;
}
