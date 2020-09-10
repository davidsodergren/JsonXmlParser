package com.david.sodergren.validation;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.IOException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class XmlValidation {

    public static boolean isXmlFileValid(String xmlFile, String schemaFile) {
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            Schema schema = schemaFactory.newSchema(new StreamSource(XmlValidation.class.getResourceAsStream(schemaFile)));
            Validator validator = schema.newValidator();
            Source schemaSource = new StreamSource(XmlValidation.class.getResourceAsStream(xmlFile));
            validator.validate(schemaSource);
            return true;
        } catch (SAXException | IOException e) {
            return false;
        }
    }
}
