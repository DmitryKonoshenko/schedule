package com.divanxan.schedule.repo;

import com.divanxan.schedule.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
