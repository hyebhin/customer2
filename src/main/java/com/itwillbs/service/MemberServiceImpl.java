package com.itwillbs.service;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // 생성자를 통한 의존성 주입
public class MemberServiceImpl implements MemberService {

    private final MemberMapper mmaper;
    // @RequiredArgsConstructor로 생성하려면 final이나 @NonNull 키워드 필수!

    @Override
    public void create(MemberVO mvo) {
        mmaper.insert(mvo);
    }
}











