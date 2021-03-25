package com.board.service;

import com.board.model.BoardDTO;

import java.util.List;

public interface BoardService {
    public BoardDTO selectBoardInfo(int bNum);
    public List<BoardDTO> selectBoardList();
    public int insertBoardInfo(BoardDTO board);
    public int updateBoardInfo(BoardDTO board);
    public int deleteBoardInfo(int bNum);
}
