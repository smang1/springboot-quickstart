package com.lab.java.springboot.quickstart.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topicList = new ArrayList<>(Arrays.asList(Topic.builder().id("spring").name("Spring Framework").description("Spring Framework description").build(),
            Topic.builder().id("spark").name("Apache Spark Framework").description("Spark Framework description").build(),
            Topic.builder().id("hadoop").name("Hadoop Framework").description("Hadoop Framework description").build(),
            Topic.builder().id("mapreduce").name("Mapreduce Framework").description("Mapreduce Framework description").build()));

    public List<Topic> getAllTopics() {
        return topicList;
    }

    public Topic getTopic(String id) {
        return topicList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicList.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topicList.size(); i++) {
            if (topicList.get(i).getId().equals(id)) {
                topicList.set(i, topic);
            }
        }
    }

    public void deleteTopic(String id) {
        topicList.removeIf(topic -> topic.getId().equals(id));
    }
}

