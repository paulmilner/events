package com.silverstone.events;

import static org.junit.Assert.assertTrue;

import java.io.StringWriter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.JAXB;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import event_logging._3.ClassificationComplexType;
import event_logging._3.DeviceComplexType;
import event_logging._3.Events;
import event_logging._3.Events.Event;
import event_logging._3.Events.Event.EventDetail;
import event_logging._3.Events.Event.EventDetail.Unknown;
import event_logging._3.Events.Event.EventSource;
import event_logging._3.Events.Event.EventTime;
import event_logging._3.SystemComplexType;

public class MessageTest {
	
	private static Logger LOGGER = LoggerFactory.getLogger(MessageTest.class);
	
	@Test
	public void create_some_sort_of_message() throws Exception {
		
		Events events = new Events();
		events.setVersion("3.4.2");
		
		Event event = new Event();
		event.setId("id1");
		
		ClassificationComplexType classification = new ClassificationComplexType();
		classification.setClassification("OFFICIAL");
		event.setClassification(classification );
		
		EventTime eventTime = new EventTime();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		String formattedTime = zonedDateTime.format(DateTimeFormatter.ISO_INSTANT);
		XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(formattedTime);
		eventTime.setTimeCreated(xmlGregorianCalendar);
		event.setEventTime(eventTime);
		
		EventSource eventSource = new EventSource();
		SystemComplexType system = new SystemComplexType();
		system.setName("Silverstone");
		system.setEnvironment("DEV");
		eventSource.setSystem(system);
		eventSource.setGenerator("GENERATOR");
		DeviceComplexType device = new DeviceComplexType();
		device.setId("deviceId1");
		eventSource.setDevice(device);
		event.setEventSource(eventSource);
		
		
		EventDetail eventDetail = new EventDetail();
		eventDetail.setTypeId("type1");
		Unknown unknown = new Unknown();
		eventDetail.setUnknown(unknown);
		
		event.setEventDetail(eventDetail);
		
		events.getEvent().add(event);
		
		StringWriter sw = new StringWriter();
		JAXB.marshal(events, sw);
		String xml = sw.toString();
		
		LOGGER.info("Message:\n" + xml);
		
		assertTrue(XmlValidatorUtil.validate(xml));
		
	}

}
