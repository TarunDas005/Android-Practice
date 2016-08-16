package com.example.jannat.smsschedular;

/**
 * Created by JANNAT on 4/29/2016.
 */
public class MessageList {
    public int id;
    private String number;
    private String body;
    private String time;

    public MessageList(String number, String body, String time) {
        this.number = number;
        this.body = body;
        this.time = time;
    }

    public MessageList(int id, String number, String body, String time) {
        this.id = id;
        this.number = number;
        this.body = body;
        this.time = time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MessageList{" +
                "number='" + number + '\'' +
                ", body='" + body + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
