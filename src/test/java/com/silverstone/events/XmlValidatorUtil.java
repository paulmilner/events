package com.silverstone.events;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

public class XmlValidatorUtil {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(XmlValidatorUtil.class);
	
	private static final String SCHEMA_FILE_LOCATION = "src/main/resources/event-logging.xsd";
	
	private static Validator VALIDATOR;
	
	static {
        try {
            SchemaFactory factory = 
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(SCHEMA_FILE_LOCATION));
            VALIDATOR = schema.newValidator();
        } catch (SAXException e) {
            System.out.println("Unable to create validator: "+e.getMessage());
        }		
	}
	
	public static boolean validate(String xml) {
		LOGGER.debug("Validating: " + xml);
		Source xmlString = new StreamSource(new StringReader(xml));
		try {
			VALIDATOR.validate(xmlString);
	    } catch (IOException | SAXException e) {
	        LOGGER.error("Validation failed: "+e.getMessage());
	        return false;
	    }		
        LOGGER.debug("Validation passed");
        return true;        
	}
	
}
