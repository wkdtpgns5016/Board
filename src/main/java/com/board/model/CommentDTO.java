package com.board.model;

import java.sql.Timestamp;

public class CommentDTO {
    int cNum;
    int cbNum;
    String cId;
    String cContent;
    Timestamp cDate;

    public CommentDTO(int cbNum, String cId, String cContent) {
        this.cbNum = cbNum;
        this.cId = cId;
        this.cContent = cContent;
    }

    public int getcNum() {
        return cNum;
    }

    public void setcNum(int cNum) {
        this.cNum = cNum;
    }

    public int getCbNum() {
        return cbNum;
    }

    public void setCbNum(int cbNum) {
        this.cbNum = cbNum;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent;
    }

    public Timestamp getcDate() {
        return cDate;
    }

    public void setcDate(Timestamp cDate) {
        this.cDate = cDate;
    }
}
