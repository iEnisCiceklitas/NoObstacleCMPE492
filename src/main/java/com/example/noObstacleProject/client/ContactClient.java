package com.example.noObstacleProject.client;

import com.example.noObstacleProject.client.utils.CallTemplate;
import com.example.noObstacleProject.client.utils.SMSTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ContactClient {

    private RestTemplate restTemplate;

    private String apiUrl = "http://localhost:8181/contact";
    @Autowired
    public ContactClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String postCall(CallTemplate callTemplate){
        return restTemplate.postForEntity(apiUrl + "/makeCall",callTemplate,String.class).getBody();

    }

    public String postSMS(SMSTemplate smsTemplate){
        return restTemplate.postForEntity(apiUrl + "/sendSMS",smsTemplate,String.class).getBody();
    }

}
