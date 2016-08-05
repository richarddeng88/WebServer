package org.richard.web.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.richard.web.messenger.database.DatabaseClass;
import org.richard.web.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(1, "where are you from?", "james"));
		messages.put(2L, new Message(2, "New York City!", "richard"));
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
			//messages.values() returns all the message we have in the map. 
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if (message.getId() <= 0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
	
	
	/*
	public List<Message> getAllMessages(){
		Message m1 = new Message(001, "hello world, richard!", "james");
		Message m2 = new Message(002, "hello world, james!", "richard");
		Message m3 = new Message(003, "where are you going today?", "tommy");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;	
	}
	*/

}
