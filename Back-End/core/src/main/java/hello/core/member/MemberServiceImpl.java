package hello.core.member;

public class MemberServiceImpl implements MemberService {

    /**
     * AppConfig 사용 전에는 ServiceImpl에서 생성자를 만듬.
     * private final MemberRepository memberRepository = new
     * MemoryMemberRepository();
     */
    private final MemberRepository memberRepository;

    /**
     * AppConfig가 생성자를 주입해준다.
     * 
     * @param memberRepository
     */
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

}
