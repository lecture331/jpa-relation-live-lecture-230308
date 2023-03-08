package com.example.jparelationlivelecture230308;

import com.example.jparelationlivelecture230308.entity.Member;
import com.example.jparelationlivelecture230308.repository.MemberRepository;
import com.example.jparelationlivelecture230308.repository.StudyGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaRelationLiveLecture230308Application {

    public static void main(String[] args) {
        SpringApplication.run(JpaRelationLiveLecture230308Application.class, args);
    }

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private StudyGroupRepository studyGroupRepository;


    @Bean
    ApplicationRunner applicationRunner() {
        return args -> {

            // 객체 입장에서 조회

            // member 정보 확인
//            List<Integer> studyGroupIds = new ArrayList<>();
//
//            List<Member> memberList = memberRepository.findAll();
//            for (Member member : memberList) {
//                System.out.println(member.toString());
//                studyGroupIds.add(member.getStudyGroupId());
//            }
//
//            // member 에서 가져온 정보로 studyGroup 의 정보를 확인 하려면?
//            for (Integer studyGroupId : studyGroupIds) {
//                StudyGroup studyGroup = studyGroupRepository.findById(studyGroupId.longValue()).orElseThrow(
//                        () -> new NullPointerException("must not be null")
//                );
//
//                System.out.println(studyGroup.toString());
//            }

            // StudyGroup 입장에서 Member 정보 조회
//            List<StudyGroup> studyGroupList = studyGroupRepository.findAll();
//            for (StudyGroup studyGroup : studyGroupList) {
//                for (Member member : studyGroup.getMemberList()) {
//                    System.out.println(member.getName());
//                }
//            }

             //Member 입장에서 Study Group 정보 가져오기
            Member member = memberRepository.findById(1L).orElseThrow(
                    () -> new NullPointerException("멤버 없음")
            );

            System.out.println(member.getName());
            System.out.println(member.getStudyGroup().getName());

        };
    }


}
