package com.jpalecture.spring.service;

import com.jpalecture.spring.entity.Member;
import com.jpalecture.spring.repository.MemberRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {
    private static final Logger log = LoggerFactory.getLogger(MemberService.class);

    @Autowired
    private MemberRepo memberRepo;

    @Transactional
    public Member findMember(long id) {
        return memberRepo.findMember(id);
    }

    @Transactional(propagation =  Propagation.REQUIRED)
    public void addNewMember() {
        Member newMember = new Member();
        newMember.setMemberId("newbe");
        newMember.setName("chalie");

        memberRepo.save(newMember);
    }

    public void delete() {
        memberRepo.remove(1L);
    }

    public void editMember() {
        Member member = memberRepo.findMember(1L);
        member.setName(member.getName() + "edited");
        memberRepo.save(member);
    }

}
