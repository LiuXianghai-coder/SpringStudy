package com.example.demo_1.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Simple {
    @JsonProperty("simpleId")
    private Integer simpleId;

    @JsonProperty("simpleName")
    private String simpleName;
}
