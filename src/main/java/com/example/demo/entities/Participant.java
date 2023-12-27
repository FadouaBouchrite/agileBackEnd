package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long participantId;
    private String participantName;
    private String participantMail;
    private String participantFonction;
    private String type;
    private byte[] pdf;

    // Constructeurs

    public Participant() {
    }

    public Participant(String participantName, String participantMail, String participantFonction, String type, byte[] pdf) {
        this.participantName = participantName;
        this.participantMail = participantMail;
        this.participantFonction = participantFonction;
        this.type = type;
        this.pdf = pdf;
    }

    public Participant(Long participantId, String participantName, String participantMail, String participantFonction, String type, byte[] pdf) {
        this.participantId = participantId;
        this.participantName = participantName;
        this.participantMail = participantMail;
        this.participantFonction = participantFonction;
        this.type = type;
        this.pdf = pdf;
    }

    // Getters and Setters

    public Long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantMail() {
        return participantMail;
    }

    public void setParticipantMail(String participantMail) {
        this.participantMail = participantMail;
    }

    public String getParticipantFonction() {
        return participantFonction;
    }

    public void setParticipantFonction(String participantFonction) {
        this.participantFonction = participantFonction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }
}
