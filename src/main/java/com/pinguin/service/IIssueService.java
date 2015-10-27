package com.pinguin.service;

import com.pinguin.domain.Issue;

import java.util.List;

/**
 * Created by ademirsoy on 24/10/15.
 */
public interface IIssueService {
    Issue saveOrUpdate(Issue issue);

    List<Issue> getAll();
}
