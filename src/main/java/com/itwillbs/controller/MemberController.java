package com.itwillbs.controller;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@RequestBody MemberVO memberVO) {
        memberService.create(memberVO);

        return "home";
    }

    @RequestMapping(value = "/read/{mno}", method = RequestMethod.GET)
    @ResponseBody
    public MemberVO read(@PathVariable int mno) {
        return memberService.read(mno);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestBody MemberVO memberVO) {
        memberService.update(memberVO);

        return "home";
    }

    @RequestMapping(value = "/delete/{mno}", method = RequestMethod.POST)
    public String delete(@PathVariable int mno) {
        memberService.delete(mno);

        return "home";
    }

}