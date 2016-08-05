package org.richard.web.messenger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.richard.web.messenger.model.Message;
import org.richard.web.messenger.service.ProductDB;
import org.richard.web.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
// we use annotation to let server : to map to "/message" using the following class. 
// when is a url request ending with /messages, web will use this class

public class MessegeResource {
	
	MessageService message_service = new MessageService();
	ProductDB message_db = new ProductDB();
	
	//// WE CALL this handler method!!!!
	@GET
		// the code need to know what's the format to send the http request info back.
		// here you are asking jersey to convert the info from .getAllMessages() to XML.
		// so you need to use JAXB to do the convertion. JAXB need clue to figure it out. 
	public List<Message> getMessages(){
		return message_service.getAllMessages();
	}

	@POST
	public Message addMessage(Message message){
		return message_service.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long id,  Message message){
		message.setId(id);
		return message_service.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long id){
		message_service.removeMessage(id);
	}

	
	@GET
	@Path("/{messageId}") // whatever in the {}, it will map to the method. 
	public Message getMessage(@PathParam("messageId") long id){
		return message_service.getMessage(id);
		//return "got path param" + messageId;
	}
}
