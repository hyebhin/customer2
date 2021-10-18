package com.itwillbs.mapper;

import com.itwillbs.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    void insertMember(MemberVO memberVO);

    MemberVO readMember(int mno);

    void updateMember(MemberVO memberVO);

    void deleteMember(int mno);

}
