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
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

//    private int study_group_id;

    @ManyToOne
    @JoinColumn(name = "study_group_id")
    private StudyGroup studyGroup; // study_group_id -> id 한 개 저장됨

    // Course : Member = N : M
    // 1 : 2 = 1번 강의에 2번 학생 , row 1개
    // 2 : 2 = 2번 강의에 2번 학생
    @OneToMany(mappedBy = "member", fetch = FetchType.EAGER)
    private List<MemberCourse> memberCourseList = new ArrayList<>();

}
