package com.infoshareacademy.parser;

public class Ticket {

    private String type;
    private String startTicket;
    private String endTicket;

    public String getStartTicket() {
        return startTicket;
    }

    public void setStartTicket(String startTicket) {
        this.startTicket = startTicket;
    }

    public String getEndTicket() {
        return endTicket;
    }

    public void setEndTicket(String endTicket) {
        this.endTicket = endTicket;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "type='" + type + '\'' +
                ", startTicket='" + startTicket + '\'' +
                ", endTicket='" + endTicket + '\'' +
                '}';
    }
}