package com.pinguin.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ademirsoy on 24/10/15.
 */
@Data
@Entity
public class Developer implements Serializable {

    public Developer(){
    }

    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

}
