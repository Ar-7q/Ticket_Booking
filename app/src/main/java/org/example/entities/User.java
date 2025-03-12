package org.example.entities;
import java.util.*;
public class User {

    private String name;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketBooked;
    private String userId;
    public String getName() {
        return name;
    }
    public List<Ticket> getTicketsBooked() {
        return ticketBooked;
    }

    public void setTicketsBooked(List<Ticket> ticketBooked) {
        this.ticketBooked = ticketBooked;
    }
}