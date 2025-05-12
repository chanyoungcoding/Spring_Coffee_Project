package com.coffee.myCoffee.service;

import com.coffee.myCoffee.Entity.Member;
import com.coffee.myCoffee.repository.MemberRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    @PostConstruct
    public void init() {
        log.info("PostConstruct 실행");
    }

    @PreDestroy
    public void close() {
        log.info("PreDestroy 실행");
    }
}
