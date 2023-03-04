package com.springboot.cosmicapi.iss_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/iss")
public class ISSRestController {
    private final ISSService issService;
    @Autowired
    public ISSRestController(ISSService issService) {
        this.issService = issService;
    }

    @GetMapping
    public ResponseEntity getIssLocation() {
        return ResponseEntity.ok(issService.getIssLocation().getIss_position());
    }
}
