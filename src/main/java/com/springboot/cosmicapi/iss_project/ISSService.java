package com.springboot.cosmicapi.iss_project;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ISSService {
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String ISS_API = "http://api.open-notify.org/iss-now.json";

    public ISS getIssLocation() {
        return restTemplate.getForEntity(ISS_API, ISS.class).getBody();
    }
}
