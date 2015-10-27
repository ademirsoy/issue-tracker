package com.pinguin.service;

import com.pinguin.domain.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ademirsoy on 24/10/15.
 */
public interface DeveloperRepository extends JpaRepository<Developer, String> {
}
