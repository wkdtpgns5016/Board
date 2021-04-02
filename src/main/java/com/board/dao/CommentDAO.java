package com.board.dao;

import com.board.model.BoardDTO;
import com.board.model.CommentDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class CommentDAO {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public List<CommentDTO> selectCommentList(int cbNum){
        HashMap<String, Object> param = new HashMap<>();
        param.put("cbNum",cbNum);
        return sqlSessionTemplate.selectList("comment.selectCommentList",param);
    }

    public int insertCommentInfo(CommentDTO comment){
        HashMap<String, Object> param = new HashMap<>();
        param.put("comment",comment);
        return sqlSessionTemplate.insert("comment.insertCommentInfo", param);
    }

    public int updateCommentInfo(String cContent) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("cContent",cContent);
        return sqlSessionTemplate.update("comment.updateCommentInfo", param);
    }

    public int deleteCommentInfo(int cNum){
        HashMap<String, Object> param = new HashMap<>();
        param.put("cNum",cNum);
        return sqlSessionTemplate.delete("comment.deleteCommentInfo", param);
    }

    public int insertCommentReplyInfo(CommentDTO comment){
        HashMap<String, Object> param = new HashMap<>();
        param.put("comment",comment);
        return sqlSessionTemplate.insert("comment.insertCommentReplyInfo", param);
    }

    public int deleteCommentGroup(int cGroup){
        HashMap<String, Object> param = new HashMap<>();
        param.put("cGroup",cGroup);
        return sqlSessionTemplate.delete("comment.deleteCommentGroup", param);
    }
}
