package com.amazonaws.serverless.sample.springboot2.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Log {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
