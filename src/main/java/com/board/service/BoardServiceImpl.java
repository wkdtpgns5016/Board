package com.board.service;

import com.board.dao.BoardDAO;
import com.board.dao.CommentDAO;
import com.board.model.BoardDTO;
import com.board.model.CommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    BoardDAO boardDAO;
    @Autowired
    CommentDAO commentDAO;

    @Override
    public BoardDTO readBoardInfo(int bNum) {
        boardDAO.updateBoardHit(bNum);
        BoardDTO board = boardDAO.selectBoardInfo(bNum);
        board.setbComments(commentDAO.selectCommentList(bNum));
        return board;
    }

    @Override
    public List<BoardDTO> readBoardList() { return boardDAO.selectBoardList(); }

    @Override
    public int createBoardInfo(BoardDTO board) { return boardDAO.insertBoardInfo(board); }

    @Override
    public int updateBoardInfo(BoardDTO board) { return boardDAO.updateBoardInfo(board); }

    @Override
    public int deleteBoardInfo(int bNum) { return boardDAO.deleteBoardInfo(bNum); }

    @Override
    public List<CommentDTO> readCommentList(int cbNum) { return commentDAO.selectCommentList(cbNum); }

    @Override
    public int createCommentInfo(CommentDTO comment) { return commentDAO.insertCommentInfo(comment); }

    @Override
    public int updateCommentInfo(String cContent) { return commentDAO.updateCommentInfo(cContent); }

    @Override
    public int deleteCommentInfo(int cNum) { return commentDAO.deleteCommentInfo(cNum); }


}
