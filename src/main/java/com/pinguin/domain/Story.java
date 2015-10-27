package com.pinguin.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by ademirsoy on 24/10/15.
 */
@Data
@JsonTypeName("story")
@Entity
public class Story extends Issue {
    @Column(name = "estimation")
    private int estimation;

    @Column(name = "status")
    private StoryStatus status;
}
