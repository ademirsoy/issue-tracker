package com.pinguin.controller;

import com.pinguin.domain.Developer;
import com.pinguin.service.IDeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by ademirsoy on 24/10/15.
 */
@RestController
@RequestMapping(value = "/developers")
public class DeveloperController {
    @Autowired
    private IDeveloperService developerService;


    @RequestMapping(method = RequestMethod.GET)
    public List<Developer> getAllIssues(){
        return this.developerService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Developer createIssue(@RequestBody @Valid Developer developer){
        return this.developerService.saveOrUpdate(developer);
    }
}
