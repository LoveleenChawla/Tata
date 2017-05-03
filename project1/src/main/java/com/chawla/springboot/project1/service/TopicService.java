package com.chawla.springboot.project1.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.chawla.springboot.project1.Topic.Topic;

@Service
public class TopicService {

private List<Topic> topics = new ArrayList<>(Arrays.asList(
		new Topic("id1", "name1", "description1"),
		new Topic("id2", "name2", "description2"),
		new Topic("id3", "name3", "description3"),
		new Topic("id4", "name4", "description4"),
		new Topic("id5", "name5", "description5"),
		new Topic("id6", "name6", "description6")
	));


	public List<Topic> getAllTopic() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);		
	}
}
