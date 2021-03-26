package com.board.service;

import com.board.dao.BoardDAO;
import com.board.model.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    BoardDAO boardDAO;

    @Override
    public BoardDTO readBoardInfo(int bNum) {
        boardDAO.updateBoardHit(bNum);
        return boardDAO.selectBoardInfo(bNum);
    }

    @Override
    public List<BoardDTO> readBoardList() { return boardDAO.selectBoardList(); }

    @Override
    public int createBoardInfo(BoardDTO board) { return boardDAO.insertBoardInfo(board); }

    @Override
    public int updateBoardInfo(BoardDTO board) { return boardDAO.updateBoardInfo(board); }

    @Override
    public int deleteBoardInfo(int bNum) { return boardDAO.deleteBoardInfo(bNum); }

}
