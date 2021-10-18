package com.itwillbs.service;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Override
    public void create(MemberVO memberVO) {
        memberMapper.insertMember(memberVO);
    }

    @Override
    public MemberVO read(int mno) {
        return memberMapper.readMember(mno);
    }

    @Override
    public void update(MemberVO memberVO) {
        memberMapper.updateMember(memberVO);
    }

    @Override
    public void delete(int mno) {
        memberMapper.deleteMember(mno);
    }

}
