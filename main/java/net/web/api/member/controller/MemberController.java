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
import net.web.api.member.domain.BmiDTO;
import net.web.api.member.domain.CalcDTO;
import net.web.api.member.domain.MemberDTO;
import net.web.api.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;


    @PostMapping("/bmi")
    public String bmi(@RequestBody BmiDTO bmi){
        return service.bmi(bmi);
    }

    @PostMapping("/calc")
    public String calc(@RequestBody CalcDTO calc){
        return service.calc(calc);
    }




}
