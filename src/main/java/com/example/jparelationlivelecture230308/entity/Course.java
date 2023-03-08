package com.example.jparelationlivelecture230308.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String instructors;
    private Double cost;

    // Course : Member = N : M
    // 1 : 2 = 1번 강의에 2번 학생 , row 1개
    // 1 : 3 = 1번 강의에 3번 학생
    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
    private List<MemberCourse> memberCourseList = new ArrayList<>();

}
