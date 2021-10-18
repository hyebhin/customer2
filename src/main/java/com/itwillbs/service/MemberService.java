package com.itwillbs.service;

import com.itwillbs.domain.MemberVO;

public interface MemberService {

    void create(MemberVO memberVO);

    MemberVO read(int mno);

    void update(MemberVO memberVO);

    void delete(int mno);
}
