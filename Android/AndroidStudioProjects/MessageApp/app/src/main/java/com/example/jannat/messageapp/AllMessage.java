package com.example.jannat.messageapp;

/**
 * Created by JANNAT on 4/8/2016.
 */
public class AllMessage {
    String senderNumber;
    String receiverNumber;
    String senderMessage;
    String receiverMessage;
    String time;
    String identifyTag;

    public String getIdentifyTag() {
        return identifyTag;
    }

    public void setIdentifyTag(String identifyTag) {
        this.identifyTag = identifyTag;
    }

    public String getReceiverMessage() {
        return receiverMessage;
    }

    public void setReceiverMessage(String receiverMessage) {
        this.receiverMessage = receiverMessage;
    }

    public String getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public String getSenderMessage() {
        return senderMessage;
    }

    public void setSenderMessage(String senderMessage) {
        this.senderMessage = senderMessage;
    }

    public String getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
