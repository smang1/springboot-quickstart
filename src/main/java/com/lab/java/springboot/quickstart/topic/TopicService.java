package com.lab.java.springboot.quickstart.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class TopicService {

    List<Topic> topicList = Arrays.asList(Topic.builder().id("spring").name("Spring Framework").description("Spring Framework description").build(),
            Topic.builder().id("spark").name("Apache Spark Framework").description("Spark Framework description").build(),
            Topic.builder().id("hadoop").name("Hadoop Framework").description("Hadoop Framework description").build(),
            Topic.builder().id("mapreduce").name("Mapreduce Framework").description("Mapreduce Framework description").build());

    public List<Topic> getAllTopics() {
        return topicList;
    }

    public Topic getTopic(String id) {


        return topicList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();



    }

}

