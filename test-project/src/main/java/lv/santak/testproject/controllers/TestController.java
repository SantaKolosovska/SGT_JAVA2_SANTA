package lv.santak.testproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class TestController {

    private final double PI = 3.14;

    @GetMapping (value = "/test")
    public String getTest() {
        return "This is a test!";
    }

    @PostMapping (value = "/test")
    public String getAnotherTest() {
        System.out.println("Something is created here");
        return "This is a response for post request";
    }

    /**
     *
     * @param radius
     * @return
     */
    @GetMapping (value = "/calculate")
    public double calculate (double radius) {
        return 2*PI*radius;
    }

}
