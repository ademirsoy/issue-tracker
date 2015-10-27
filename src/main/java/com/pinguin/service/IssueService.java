package com.pinguin.service;

import com.pinguin.domain.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ademirsoy on 24/10/15.
 */
@Service
public class IssueService implements IIssueService {

    @Autowired
    private IssueRepository repository;

    @Override
    @Transactional
    public Issue saveOrUpdate(Issue issue) {
        return this.repository.save(issue);
    }

    @Override
    public List<Issue> getAll() {
        return this.repository.findAll();
    }
}
