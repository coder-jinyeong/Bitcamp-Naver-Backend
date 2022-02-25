/**
 * packageName: net.web.api.member.domain
 * fileNa     : LoginDTO
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
public class LoginDTO {
    public static String LOGIN_TITLE = "LOGIN";
    public static String PASSWORD = "abc";

    private String id;
    private String pw;
    private String name;
}
