package com.example.springindex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ApiController {

    @GetMapping("/")
    public String index(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://byabbe.se/on-this-day/7/7/events.json";
        ApiResponse apiResponse = restTemplate.getForObject(apiUrl, ApiResponse.class);
        model.addAttribute("events", apiResponse.getEvents());
        return "index";
    }

}
