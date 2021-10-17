package com.itwillbs.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.itwillbs.domain.MemberVO;

@Mapper
public interface MemberMapper {

	// 메서드명을
	// Mapper.xml의 <insert id>랑 맞추기
	void insertMember(MemberVO memberVO);
	
	MemberVO getMember(int mno);
	
	void updateMember(MemberVO memberVO);
	
	void deleteMember(int mno);
	
}
