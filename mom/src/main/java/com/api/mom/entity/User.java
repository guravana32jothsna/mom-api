package com.api.mom.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Users")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uid;
    private String username , group_name , designation;

    @OneToMany(targetEntity = Meetings.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "meet_user_fk" , referencedColumnName = "uid")
    private List<Meetings> meetings;

}
