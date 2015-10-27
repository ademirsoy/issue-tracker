package com.pinguin.service;

import com.pinguin.domain.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ademirsoy on 24/10/15.
 */
@Service
public class DeveloperService implements IDeveloperService {

    @Autowired
    private DeveloperRepository repository;

    @Override
    @Transactional
    public Developer saveOrUpdate(Developer developer) {
        return this.repository.save(developer);
    }

    @Override
    public List<Developer> getAll() {
        return this.repository.findAll();
    }
}
