package com.test.iconplus.controller;

import com.test.iconplus.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class SummaryApiController {
    private final SummaryService summaryService;

    @Autowired
    public SummaryApiController(SummaryService summaryService) {
        this.summaryService = summaryService;
    }

    @GetMapping("/summary")
    public Map<String, Object> getSummary() {
        return summaryService.getSummary();
    }
}
