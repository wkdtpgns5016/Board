package com.board.model;

import java.sql.Timestamp;

public class CommentDTO {
    int cNum;
    int cbNum;
    String cId;
    String cContent;
    Timestamp cDate;
    int cGroup;
    int cGroupNum;

    public CommentDTO(int cbNum, String cId, String cContent) {
        this.cbNum = cbNum;
        this.cId = cId;
        this.cContent = cContent;
        this.cGroup = 0;
        this.cGroupNum = 0;
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

    public int getcGroup() { return cGroup; }

    public void setcGroup(int cGroup) { this.cGroup = cGroup; }

    public int getcGroupNum() { return cGroupNum; }

    public void setcGroupNum(int cGroupNum) { this.cGroupNum = cGroupNum; }

}
