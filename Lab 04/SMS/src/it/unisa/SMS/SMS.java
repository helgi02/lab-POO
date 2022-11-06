package it.unisa.SMS;

import java.util.GregorianCalendar;

public class SMS {
    private String sender;
    private GregorianCalendar data;
    private String text;

    public SMS(String sender, GregorianCalendar data, String text)    {
        this.sender = sender;
        this.data = data;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }

    public GregorianCalendar getData() {
        return data;
    }
}