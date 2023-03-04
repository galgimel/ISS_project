package com.springboot.cosmicapi.iss_project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ISS {
    private IssPosition iss_position;

    public class IssPosition {
        public String longitude;
        public String latitude;
    }
}

