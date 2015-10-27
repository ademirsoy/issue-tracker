package com.pinguin.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by ademirsoy on 24/10/15.
 */
@Data
@JsonTypeName("bug")
@Entity
public class Bug extends Issue {
    @Column(name = "priority")
    private Priority priority;

    @Column(name = "status")
    private IssueStatus status;
}
