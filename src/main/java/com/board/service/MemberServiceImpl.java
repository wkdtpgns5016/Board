package com.board.service;

import com.board.dao.MemberDAO;
import com.board.model.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberDAO memberDAO;

    @Override
    public int insertMemberInfo(MemberDTO member){ return memberDAO.insertMemberInfo(member); }

    @Override
    public MemberDTO selectMemberInfo(String memId, String memPw){ return memberDAO.selectMemberInfo(memId, memPw); }
}
