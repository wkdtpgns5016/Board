package com.board.dao;

import com.board.model.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class BoardDAO {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public BoardDTO selectBoardInfo(int bNum) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("bNum",bNum);
        return sqlSessionTemplate.selectOne("board.selectBoardInfo",param);
    }

    public List<BoardDTO> selectBoardList() {
        return sqlSessionTemplate.selectList("board.selectBoardList");
    }

    public int insertBoardInfo(BoardDTO board) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("board",board);
        return sqlSessionTemplate.insert("board.insertBoardInfo", param);
    }

    public int updateBoardInfo(BoardDTO board) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("board",board);
        return sqlSessionTemplate.update("board.updateBoardInfo", param);
    }

    public int deleteBoardInfo(int bNum) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("bNum",bNum);
        return sqlSessionTemplate.delete("board.deleteBoardInfo", param);
    }

    public int updateBoardHit(int bNum){
        HashMap<String, Object> param = new HashMap<>();
        param.put("bNum",bNum);
        return sqlSessionTemplate.update("board.updateBoardHit", param);
    }
}
