/**
 * packageName: net.web.api.member.controller
 * fileNa     : MemberController
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

package net.web.api.member.controller;


import lombok.RequiredArgsConstructor;
import net.web.api.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    @GetMapping("/member/bmi/{usename}/{height}/{weight}")
    public String getBmi(@PathVariable String usename,
                         @PathVariable double height,
                         @PathVariable double weight){
        System.out.println(" 리액트에서 넘어온 이름 : " + usename);
        System.out.println(" 리액트에서 넘어온 키 : " + height);
        System.out.println(" 리액트에서 넘어온 몸무게 : " + weight);

        return "BMI 는 정상";
    }
}
