package com.lab.java.springboot.quickstart.topic;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

@Builder
@Data
// We need to no longer use @Tolerate or @Data and
// instead we create accessors and mutators via @Getter and @Setter,
// create the default constructor via @NoArgsConstructor,
// and finally we create the all args constructor that the builder requires via @AllArgsConstructor
public class Topic {
    private String id;
    private String name;
    private String description;

    @Tolerate //To add a default constructor
    public Topic(){}

}
