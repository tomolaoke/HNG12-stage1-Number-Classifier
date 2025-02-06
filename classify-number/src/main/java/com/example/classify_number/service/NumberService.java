package com.example.classify_number.service;

import com.example.classify_number.model.NumberProperties;
import com.example.classify_number.utils.NumberUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumberService {

    private final RestTemplate restTemplate = new RestTemplate();

    public NumberProperties classifyNumber(int number) {
        NumberProperties properties = new NumberProperties();
        properties.setNumber(number);
        properties.setPrime(NumberUtils.isPrime(number));
        properties.setPerfect(NumberUtils.isPerfect(number));
        properties.setDigitSum(NumberUtils.digitSum(number));
        properties.setProperties(classifyProperties(number));
        properties.setFunFact(getFunFact(number));
        return properties;
    }

    private List<String> classifyProperties(int number) {
        List<String> properties = new ArrayList<>();
        if (NumberUtils.isArmstrong(number)) properties.add("armstrong");
        properties.add(number % 2 == 0 ? "even" : "odd");
        return properties;
    }

    private String getFunFact(int number) {
        String url = "http://numbersapi.com/" + number + "/math";
        return restTemplate.getForObject(url, String.class);
    }
}
