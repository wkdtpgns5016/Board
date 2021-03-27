package com.board.dao;

import com.board.model.MemberDTO;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class MemberDAO {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public int insertMemberInfo(MemberDTO member) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("member", member);
        return sqlSessionTemplate.insert("member.insertMemberInfo", param);
    }

    public MemberDTO selectMemberInfo(String memId, String memPw) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("memId", memId);
        param.put("memPw", memPw);
        return sqlSessionTemplate.selectOne("member.selectMemberInfo", param);
    }

    public int updateMemberInfo(MemberDTO member) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("member", member);
        return sqlSessionTemplate.update("member.updateMemberInfo",param);
    }

    public int deleteMemberInfo(String memId) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("memId", memId);
        return sqlSessionTemplate.delete("member.deleteMemberInfo",param);
    }
}
