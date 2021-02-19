package com.example.demo_1.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToSearchPageConvert implements Converter<String, SearchPage> {
    @Override
    public SearchPage convert(String s) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(s, SearchPage.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
