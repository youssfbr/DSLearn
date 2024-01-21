package com.github.youssfbr.dslearn.dtos;

import com.github.youssfbr.dslearn.entities.enums.DeliverStatus;

import java.io.Serializable;

public class DeliverRevisionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;

    public DeliverRevisionDTO() {}

    public DeliverRevisionDTO(DeliverStatus status , String feedback , Integer correctCount) {
        this.status = status;
        this.feedback = feedback;
        this.correctCount = correctCount;
    }

    public DeliverStatus getStatus() {
        return status;
    }

    public String getFeedback() {
        return feedback;
    }

    public Integer getCorrectCount() {
        return correctCount;
    }
}
