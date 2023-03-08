package com.example.jparelationlivelecture230308.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
//@ToString
@NoArgsConstructor
public class StudyGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String goal;

    // StudyGroup : Member = 1 : N
    // StudyGroup 테이블은 연관관계의 주인인 Member 테이블의 “studyGroup” 필드에 해당한다!
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "studyGroup")
    List<Member> memberList = new ArrayList<>();
}
