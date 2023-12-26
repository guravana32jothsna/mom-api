package com.api.mom.controller;

import com.api.mom.dto.MeetingDTO;
import com.api.mom.entity.User;
import com.api.mom.repository.MeetingRepository;
import com.api.mom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class meetingController {
    @Autowired
    private MeetingRepository meetingRepository;
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User recordMeeting(@RequestBody MeetingDTO meetingDTO) {
        return userRepository.save(meetingDTO.getUser());
    }
}
