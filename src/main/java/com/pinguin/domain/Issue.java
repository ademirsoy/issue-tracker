package com.pinguin.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by ademirsoy on 24/10/15.
 */
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(name = "story", value = Story.class),
        @JsonSubTypes.Type(name = "bug", value = Bug.class)
})
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public abstract class Issue implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Column(name = "title")
    @Size(max = 64)
    private String title;

    @Column(name = "description")
    @Size(max = 128)
    private String description;

    @Column(name = "creationDate")
    private Date creationDate;

    @Column(name = "assigneeId")
    private Long assigneeId;
}
