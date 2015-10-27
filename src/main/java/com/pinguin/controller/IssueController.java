package com.pinguin.controller;

import com.pinguin.domain.Issue;
import com.pinguin.service.IIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * Created by ademirsoy on 24/10/15.
 */
@RestController
@RequestMapping(value = "/issues")
public class IssueController {
    @Autowired
    private IIssueService issueService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Issue> getAllIssues(){
        return this.issueService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Issue createIssue(@RequestBody @Valid Issue issue){
        issue.setCreationDate(new Date());
        return this.issueService.saveOrUpdate(issue);
    }

    @RequestMapping(method = RequestMethod.PUT, value="{id}")
    public Issue updateIssue(@PathVariable String id, @RequestBody @Valid Issue issue){
        return this.issueService.saveOrUpdate(issue);
    }
}
