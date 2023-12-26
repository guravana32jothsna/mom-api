package com.api.mom.entity;

import com.fasterxml.jackson.databind.JsonNode;
import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.UUID;

public class Meetings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String host_name; //from login creds
    private String meeting_id;
    private String group_name;
    private String mode_of_meeting;
    private String location;
    private String title;
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime created_time;  //auto

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime date_of_meeting;

    @Type(JsonType.class)
    private JsonNode azenda_resolutions;
}

//(uuid1*  , meeting_id ,group_name , mode_of_meeting ,location ,
// title ,status , created_time* , date ,  azenda())