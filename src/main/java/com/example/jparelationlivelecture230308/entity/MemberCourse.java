package com.example.jparelationlivelecture230308.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class MemberCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Course : Member = N : M
    // 1 : 2 = 1번 강의에 2번 학생 , row 1개
    // 1 : 3 = 1번 강의에 3번 학생
    // 2 : 2 = 2번 강의에 2번 학생

    // MemberCourse 객체 하나가 row 1개
    // Course, Member 를 하나씩 가지고 있어야 위 개념을 표현 가능하다.

    @ManyToOne
    private Course course; // course_id

    @ManyToOne
    private Member member; // member_id

}
