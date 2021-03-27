package com.board.service;

import com.board.model.MemberDTO;

public interface MemberService {
    public int insertMemberInfo(MemberDTO member);
    public MemberDTO selectMemberInfo(String memId, String memPw);
    public int updateMemberInfo(MemberDTO member);
    public int deleteMemberInfo(String memId);
}

