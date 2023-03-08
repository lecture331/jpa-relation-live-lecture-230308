package com.example.jparelationlivelecture230308.repository;

import com.example.jparelationlivelecture230308.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
