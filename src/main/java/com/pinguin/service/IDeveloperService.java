package com.pinguin.service;

import com.pinguin.domain.Developer;

import java.util.List;

/**
 * Created by ademirsoy on 24/10/15.
 */
public interface IDeveloperService {
    Developer saveOrUpdate(Developer developer);

    List<Developer> getAll();
}
