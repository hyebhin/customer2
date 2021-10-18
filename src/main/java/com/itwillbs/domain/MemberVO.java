package com.itwillbs.domain;

import lombok.*;

// @Data // 아래 롬복 어노테이션을 하나로 합쳐놓은 것
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class MemberVO {

    private int mno;
    private String name;
    private String password;

}
