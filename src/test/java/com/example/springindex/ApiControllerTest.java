package com.example.springindex;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ApiControllerTest {

    @Autowired
    private ApiController apiController;

    @Test
    public void testApiCallReturnsNonNullValue() {
        RestTemplate restTemplate = new RestTemplate();
        LocalDate currentDate = LocalDate.now();
        int currentDay = currentDate.getDayOfMonth();
        int currentMonth = currentDate.getMonthValue();

        String apiUrl = "https://byabbe.se/on-this-day/" + currentMonth + "/" + currentDay + "/events.json";

        ApiResponse apiResponse = restTemplate.getForObject(apiUrl, ApiResponse.class);

        assertNotNull(apiResponse, "API response should not be null");
    }
}