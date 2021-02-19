package com.example.demo_1.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SearchPage {
    @JsonProperty("startLocation")
    private Integer startLocation;

    @JsonProperty("size")
    private Integer size;

    @JsonProperty("sortCol")
    private String sortCol;
}
