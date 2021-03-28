package com.board.model;

import java.sql.Timestamp;
import java.util.List;

public class BoardDTO {
    int bNum;
    String bId;
    String bTitle;
    String bContent;
    Timestamp bDate;
    int bHits;
    List<CommentDTO> bComments;

    public BoardDTO(String bId, String bTitle, String bContent) {
        this.bId = bId;
        this.bTitle = bTitle;
        this.bContent = bContent;
    }

    public int getbNum() {
        return bNum;
    }

    public void setbNum(int bNum) {
        this.bNum = bNum;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }

    public String getbContent() {
        return bContent;
    }

    public void setbContent(String bContent) {
        this.bContent = bContent;
    }

    public Timestamp getbDate() {
        return bDate;
    }

    public void setbDate(Timestamp bDate) {
        this.bDate = bDate;
    }

    public int getbHits() {
        return bHits;
    }

    public void setbHits(int bHits) {
        this.bHits = bHits;
    }

    public List<CommentDTO> getbComments() { return bComments; }

    public void setbComments(List<CommentDTO> bComments) { this.bComments = bComments; }
}
