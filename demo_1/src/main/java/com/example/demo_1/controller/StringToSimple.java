package com.example.demo_1.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author : LiuXianghai on 2021/2/19
 * @Created : 2021/02/19 - 22:28
 * @Project : demo_1
 */
@Component
public class StringToSimple implements Converter<String, Simple> {
    @Override
    public Simple convert(String s) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(s, Simple.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
