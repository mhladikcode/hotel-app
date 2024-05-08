package com.swiproject.hotelreservationsystem.response;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class BookingResponse {
    private Long bookingId;
    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private String guestFullName;
    @Column(name = "guest_Email")
    private String guestEmail;
    @Column(name = "adults")
    private int NumOfAdults;
    @Column(name = "children")
    private int NumOfChildren;
    @Column(name = "total_guest")
    private int totalNumberOfGuests;

    @Column(name = "confirmation_Code")
    private String bookingConfirmationCode;
}
