package com.itwillbs.mapper;

import com.itwillbs.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    void insert(MemberVO mvo);

}
