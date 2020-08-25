package com.silverstone.events;

import java.io.StringWriter;

import javax.xml.bind.JAXB;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import event_logging._3.Events;
import event_logging._3.Events.Event;

public class MessageTest {
	
	private static Logger LOGGER = LoggerFactory.getLogger(MessageTest.class);
	
	@Test
	public void create_some_sort_of_message() throws Exception {
		
		Events events = new Events();
		Event event = new Event();
		events.getEvent().add(event);
		
		StringWriter sw = new StringWriter();
		JAXB.marshal(events, sw);
		String xml = sw.toString();
		
		LOGGER.info("Message:\n" + xml);
		
	}

}
