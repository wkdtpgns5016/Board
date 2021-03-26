package com.board.service;

import com.board.model.BoardDTO;

import java.util.List;

public interface BoardService {
    public BoardDTO readBoardInfo(int bNum);
    public List<BoardDTO> readBoardList();
    public int createBoardInfo(BoardDTO board);
    public int updateBoardInfo(BoardDTO board);
    public int deleteBoardInfo(int bNum);
}
