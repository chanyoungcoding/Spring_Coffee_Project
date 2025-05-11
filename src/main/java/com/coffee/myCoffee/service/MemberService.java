package com.coffee.myCoffee.service;

import com.coffee.myCoffee.Entity.Member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
