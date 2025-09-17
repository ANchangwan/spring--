//package hello.hellospring.service;
//
//import hello.hellospring.domain.Member;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MembereSrviceTest {
//
//    MembereSrvice membereSrvice = new MembereSrvice();
//
//    @Test
//    void join() {
//        //given
//        Member member = new Member();
//        member.setName("hello");
//
//        //when
//        Long saveId = membereSrvice.join(member);
//
//        //then
//        Member findMember = membereSrvice.findOne(saveId).get();
//        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
//    }
//
//    @Test
//    public void 중복_회원_예외(){
//        Member member1 = new Member();
//        member1.setName("spring");
//
//        Member member2 = new Member();
//        member2.setName("spring");
//        membereSrvice.join(member1);
////        assertThrows(IllegalStateException.class, () -> membereSrvice.join(member2));
//    }
//
//    @Test
//    void findMember() {
//
//    }
//
//    @Test
//    void findOne() {
//    }
//}