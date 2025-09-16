package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepsitory repsitory = new MemoryMemberRepsitory();

    @AfterEach
    public void afterEach() {
        repsitory.clearStore();
    }


    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");
        repsitory.save(member);

        Member result = repsitory.findById(member.getId()).get();

        Assertions.assertThat(result).isEqualTo(member);
    }

    @Test
    public void findByName(){
        Member member = new Member();
        member.setName("spring1");
        repsitory.save(member);

        Member member1 = new Member();
        member1.setName("spring2");
        repsitory.save(member1);


        Member result = repsitory.findByName("spring1").get();
        Assertions.assertThat(result).isEqualTo(member);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repsitory.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repsitory.save(member2);

        List<Member> members = repsitory.findAll();

        Assertions.assertThat(repsitory.findAll()).hasSize(2);
    }
}
