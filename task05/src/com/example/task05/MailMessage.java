package com.example.task05;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MailMessage implements IMail<String>{
    private String Content;
    private String to;
    private String from;

    public MailMessage(String from, String to, String Content) {
        this.from = from;
        this.to = to;
        this.Content = Content;
    }

    public String getContent() {
        return Content;
    }


    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }
}
