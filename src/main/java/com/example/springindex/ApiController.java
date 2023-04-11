package com.example.springindex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDate;


@Controller
public class ApiController {

    @GetMapping("/")
    public String index(Model model) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        int currentDay = currentDate.getDayOfMonth();
        int currentMonth = currentDate.getMonthValue();

        // Replace the hardcoded day and month with the current day and month
        String apiUrl = "https://byabbe.se/on-this-day/" + currentMonth + "/" + currentDay + "/events.json";

        RestTemplate restTemplate = new RestTemplate();
        ApiResponse apiResponse = restTemplate.getForObject(apiUrl, ApiResponse.class);

        model.addAttribute("events", apiResponse.getEvents());

        return "index";
    }

}
