/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto.reservation;

import java.util.Date;

/**
 * The reservation detail gives a detailed describtion of a reservation where 
 * the ticket type tells if a passengers is in a vehicle or is walking onboard.
 * It also contains a date and a route the passenger has taken.
 */
public class ReservationDetail extends ReservationIdentifier{
    
    private Date date;
    private double price;
    private String ticketType;
    private String firstName;
    private String lastName;
    private String email;
    private int routeId;

    public ReservationDetail(long id, Date date, double price, String ticketType, String firstName, String lastName, String email, int routeId) {
        super(id);
        this.date = date;
        this.price = price;
        this.ticketType = ticketType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.routeId = routeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getRouteId() {
        return routeId;
    }

    public void setRoute(int routeId) {
        this.routeId = routeId;
    }
}
