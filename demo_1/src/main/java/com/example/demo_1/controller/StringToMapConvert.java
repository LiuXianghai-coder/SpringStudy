package com.example.demo_1.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author : LiuXianghai on 2021/2/19
 * @Created : 2021/02/19 - 15:01
 * @Project : demo_1
 */
@Component
public class StringToMapConvert implements Converter<String, Map<String, SearchPage>> {
    @Override
    public Map<String, SearchPage> convert(String s) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(s, new TypeReference<>() {});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
