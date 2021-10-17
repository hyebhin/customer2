package com.itwillbs.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	
	// 생성자
	private final MemberMapper memberMapper;
	
	@Override
	@Transactional
	public void create(MemberVO memberVO) {
		System.out.println(memberVO);
		memberMapper.insertMember(memberVO);
		
	}

	@Override
	public MemberVO read(int mno) {
		MemberVO vo = memberMapper.getMember(mno);
		System.out.println(vo);
		return vo;
	}

	@Override
	@Transactional
	public void update(MemberVO memberVO) {
		memberMapper.updateMember(memberVO);
	}

	@Override
	@Transactional
	public void delete(int mno) {
		memberMapper.deleteMember(mno);
	}
	
}
