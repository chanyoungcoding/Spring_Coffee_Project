package com.coffee.myCoffee.repository;

import com.coffee.myCoffee.Entity.Member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long id);
}
