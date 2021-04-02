package com.board.service;

import com.board.model.BoardDTO;
import com.board.model.CommentDTO;

import java.util.List;

public interface BoardService {
    public BoardDTO readBoardInfo(int bNum);
    public List<BoardDTO> readBoardList();
    public int createBoardInfo(BoardDTO board);
    public int updateBoardInfo(BoardDTO board);
    public int deleteBoardInfo(int bNum);


    public List<CommentDTO> readCommentList(int cbNum);
    public int createCommentInfo(CommentDTO comment);
    public int updateCommentInfo(String cContent);
    public int deleteCommentInfo(int cNum,int cGroup, int cGroupNum);
}
