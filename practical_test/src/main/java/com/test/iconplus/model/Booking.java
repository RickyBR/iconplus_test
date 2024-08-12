package com.test.iconplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("bookingDate")
    private LocalDateTime bookingDate;

    @JsonProperty("officeName")
    private String officeName;

    @JsonProperty("startTime")
    private LocalDateTime startTime;

    @JsonProperty("endTime")
    private LocalDateTime endTime;

    @JsonProperty("listConsumption")
    private List<Konsumsi> listConsumption;

    @JsonProperty("participants")
    private Integer participants;

    @JsonProperty("roomName")
    private String roomName;

    public Long getId() {
        return id;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public String getOfficeName() {
        return officeName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public List<Konsumsi> getListConsumption() {
        return listConsumption;
    }

    public Integer getParticipants() {
        return participants;
    }

    public String getRoomName() {
        return roomName;
    }
}
