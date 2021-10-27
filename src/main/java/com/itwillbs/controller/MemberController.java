package com.itwillbs.controller;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController // @Controller아니고 @RestController인거 주의!!
@RequestMapping("/members") // REST API URI 네이밍 규칙 -> VO명의 복수로 네이밍 (컬렉션)
@RequiredArgsConstructor
public class MemberController {
    // REST API : JSON 형식으로 통신

    private final MemberService mService;

    /*
       * Mapping종류
        Post : 생성
        Get : 확인
        Put : 수정
        Delete : 삭제
     */

    @PostMapping
    public String register(@RequestBody MemberVO mvo){
        mService.create(mvo);
        return "회원 생성 완료!";
    }



}