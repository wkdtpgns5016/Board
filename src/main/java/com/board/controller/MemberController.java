package com.board.controller;

import com.board.model.BoardDTO;
import com.board.model.MemberDTO;
import com.board.service.BoardService;
import com.board.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/board")
public class MemberController {
    @Autowired
    MemberService memberService;
    @Autowired
    BoardService boardService;

    @RequestMapping("/login")
    public String loginView(HttpSession session){
        if(session.getAttribute("member") == null) return "loginView";
        else return "redirect:/board/main";
    }

    @RequestMapping("/signUp")
    public String signupView(HttpSession session){
        if(session.getAttribute("member") == null) return "signupView";
        else return "redirect:/board/main";
    }

    @RequestMapping("/main")
    public String mainView(HttpSession session, Model model){
        if(session.getAttribute("member") == null) return "redirect:/board/login";
        else {
            List<BoardDTO> list = boardService.selectBoardList();
            model.addAttribute("list",list);
            return "mainView";
        }
    }

    @RequestMapping(value = "/signOK", method=RequestMethod.POST)
    public String createMember(@RequestParam("memName") String memName,
                        @RequestParam("memId") String memId,
                        @RequestParam("memPw") String memPw,
                        @RequestParam("memPhone") String memPhone,
                        @RequestParam("memEmail") String memEmail){
        MemberDTO member = new MemberDTO(memId,memPw,memName,memPhone,memEmail);
        memberService.insertMemberInfo(member);
        return"redirect:/board/login";
    }

    @RequestMapping(value = "/loginOK")
    public String loginMember(@RequestParam("memId") String memId,
                              @RequestParam("memPw") String memPw, HttpSession session) {
        MemberDTO member = memberService.selectMemberInfo(memId,memPw);
        session.setAttribute("member",member);
        return "redirect:/board/main";
    }

    @RequestMapping(value = "/logout")
    public String logoutMember(HttpSession session) {
        session.invalidate();
        return"redirect:/board/login";
    }

    @RequestMapping("/write")
    public String writeView(){
        return "boardWriteView";
    }

    @RequestMapping("/writeOK")
    public String createBoard(@RequestParam("bTitle") String bTitle,
                              @RequestParam("bContent") String bContent,HttpSession session){

        MemberDTO member = (MemberDTO)session.getAttribute("member");
        System.out.println(member.getMemName() + "가 쓴"+bTitle);
        BoardDTO board = new BoardDTO(member.getMemId(),bTitle,bContent);
        boardService.insertBoardInfo(board);
        return "redirect:/board/main";
    }
    @RequestMapping("/content")
    public String contentView(@RequestParam("bNum") String bNum){

        return "/boardView";
    }
}
