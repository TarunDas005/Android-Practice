package com.example.jannat.messageapp;

import java.io.Serializable;

/**
 * Created by JANNAT on 4/4/2016.
 */
public class SmsSentInformation {

    String receiverNumber;
    String receiverMessage;
    String Sendingtime;

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

    public String getSendingtime() {
        return Sendingtime;
    }

    public void setSendingtime(String sendingtime) {
        Sendingtime = sendingtime;
    }
}
