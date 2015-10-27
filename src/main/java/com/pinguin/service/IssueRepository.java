package com.pinguin.service;

import com.pinguin.domain.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ademirsoy on 24/10/15.
 */
public interface IssueRepository  extends JpaRepository<Issue, Long> {
}
