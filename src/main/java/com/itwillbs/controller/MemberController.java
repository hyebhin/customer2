package com.itwillbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(@RequestBody MemberVO memberVO) {
		System.out.println("진입");
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
