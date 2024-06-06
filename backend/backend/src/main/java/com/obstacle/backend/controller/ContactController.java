package com.obstacle.backend.controller;

import com.obstacle.backend.client.ContactClient;
import com.obstacle.backend.client.utils.CallTemplate;
import com.obstacle.backend.client.utils.SMSTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private ContactClient contactClient;

    @Autowired
    public ContactController(ContactClient contactClient) {
        this.contactClient = contactClient;
    }

    @PostMapping("/sendSMS")
    public String sendSMS(@RequestBody SMSTemplate smsTemplate){
        return contactClient.postSMS(smsTemplate);
    }

    @PostMapping("/makeCall")
    public String makeCall(@RequestBody CallTemplate callTemplate){
        return contactClient.postCall(callTemplate);
    }


}
