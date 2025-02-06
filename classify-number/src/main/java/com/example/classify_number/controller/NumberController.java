package com.example.classify_number.controller;

import com.example.classify_number.model.NumberProperties;
import com.example.classify_number.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NumberController {

    @Autowired
    private NumberService numberService;

    @GetMapping("/classify-number")
    public Object classifyNumber(@RequestParam("number") String numberStr) {
        try {
            int number = Integer.parseInt(numberStr);
            return numberService.classifyNumber(number);
        } catch (NumberFormatException e) {
            NumberProperties errorResponse = new NumberProperties();
            errorResponse.setNumber(0); // or any default value
            errorResponse.setError(true);
            return errorResponse;
        }
    }
}
