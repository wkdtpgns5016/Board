package com.board.controller;

import com.board.model.BoardDTO;
import com.board.model.MemberDTO;
import com.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    BoardService boardService;

    @RequestMapping("/main")
    public String mainView(HttpSession session, Model model){
        if(session.getAttribute("member") == null) return "redirect:/board/login";
        else {
            List<BoardDTO> list = boardService.readBoardList();
            model.addAttribute("list",list);
            return "mainView";
        }
    }

    @RequestMapping("/content")
    public String contentView(@RequestParam("bNum") String bNum, Model model){
        BoardDTO content = boardService.readBoardInfo(Integer.parseInt(bNum));
        model.addAttribute("content",content);
        return "boardView";
    }

    @RequestMapping("/write")
    public String writeView(){
        return "boardWriteView";
    }

    @RequestMapping("/writeOK")
    public String createBoard(@RequestParam("bTitle") String bTitle,
                              @RequestParam("bContent") String bContent,HttpSession session){

        MemberDTO member = (MemberDTO)session.getAttribute("member");
        BoardDTO board = new BoardDTO(member.getMemId(),bTitle,bContent);
        boardService.createBoardInfo(board);
        return "redirect:/board/main";
    }

    @RequestMapping("/modify")
    public String modifyView(@ModelAttribute("content") BoardDTO content){
        return "boardModifyView";
    }

    @RequestMapping("/modifyOK")
    public String updateBoard(@ModelAttribute("content") BoardDTO content){
        boardService.updateBoardInfo(content);
        return "redirect:/board/main";
    }

    @RequestMapping("/delete")
    public String deleteBoard(@RequestParam("bNum") String bNum){
        boardService.deleteBoardInfo(Integer.parseInt(bNum));
        return "redirect:/board/main";
    }
}
