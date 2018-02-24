package com.lab.java.springboot.quickstart.topic;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Topic {
    private String id;
    private String name;
    private String description;

}
