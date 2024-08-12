package com.test.iconplus.service;

import com.test.iconplus.model.Booking;
import com.test.iconplus.model.Konsumsi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SummaryService {

    private final RestTemplate restTemplate;

    @Autowired
    public SummaryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private static final String BOOKING_LIST_URL = "https://66876cc30bc7155dc017a662.mockapi.io/api/dummy-data/bookingList";
    private static final String MASTER_JENIS_KONSUMSI_URL = "https://6686cb5583c983911b03a7f3.mockapi.io/api/dummy-data/masterJenisKonsumsi";

    public Map<String, Object> getSummary() {
        List<Booking> bookings = restTemplate.exchange(
                BOOKING_LIST_URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Booking>>() {}
        ).getBody();

        List<Konsumsi> konsumsiList = restTemplate.exchange(
                MASTER_JENIS_KONSUMSI_URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Konsumsi>>() {}
        ).getBody();

        Map<String, Object> summary = new HashMap<>();
        summary.put("totalBookings", bookings.size());

        Map<String, Integer> bookingsByKonsumsi = new HashMap<>();
        for (Booking booking : bookings) {
            for (Konsumsi konsumsi : booking.getListConsumption()) {
                String konsumsiName = konsumsi.getName();
                bookingsByKonsumsi.put(konsumsiName, bookingsByKonsumsi.getOrDefault(konsumsiName, 0) + 1);
            }
        }

        summary.put("bookingsByKonsumsi", bookingsByKonsumsi);
        summary.put("konsumsiTypes", konsumsiList);

        return summary;
    }
}
