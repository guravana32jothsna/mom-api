package com.api.mom.repository;

import com.api.mom.entity.Meetings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MeetingRepository extends JpaRepository<Meetings, UUID> {
}
