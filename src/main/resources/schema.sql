DROP TABLE IF EXISTS course CASCADE;
DROP TABLE IF EXISTS member CASCADE;
DROP TABLE IF EXISTS study_group CASCADE;

CREATE TABLE course
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    title       VARCHAR(255),
    instructors VARCHAR(255),
    cost        DOUBLE,
    CONSTRAINT pk_course PRIMARY KEY (id)
);

CREATE TABLE member
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    name       VARCHAR(255),
    age        INTEGER,

    study_group_id INTEGER,
    CONSTRAINT pk_member PRIMARY KEY (id)
);

CREATE TABLE study_group
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    name       VARCHAR(255),
    goal VARCHAR(255),
    CONSTRAINT pk_study_group PRIMARY KEY (id)
);

alter table member
    add constraint member_study_group
        foreign key (study_group_id) references study_group;

INSERT INTO study_group (id, name, goal) VALUES (1, 'JPA RELATION', 'MASTER');
INSERT INTO study_group (id, name, goal) VALUES (2, 'SPRING', 'CHALLENGE');

INSERT INTO member (id, name, age, study_group_id) VALUES (1, 'robbie', '100', 1);
INSERT INTO member (id, name, age, study_group_id) VALUES (2, 'bin', '99', 2);
INSERT INTO member (id, name, age, study_group_id) VALUES (3, 'haha', '88', 1);