package com.hello.core.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MemoryMemberRepository implements MemberRepository {
	
	//동시성 이슈 때문에 CurrentHashMap을 사용해야 한다.
	private static Map<Long, Member> store = new HashMap<>();

	@Override
	public void save(Member member) {
		store.put(member.getId(), member);
	}

	@Override
	public Member findById(Long memberId) {
		return store.get(memberId);
	}

}
