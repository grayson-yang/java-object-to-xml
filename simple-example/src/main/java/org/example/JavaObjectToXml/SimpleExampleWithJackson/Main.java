package org.example.JavaObjectToXml.SimpleExampleWithJackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {
    public static void main(String[] args) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            String xml = xmlMapper.writeValueAsString(new SimpleBean());
            System.out.println("XML:");
            System.out.println(xml);
            String formatXml = new SimpleXmlFormat().format(xml);
            System.out.println("Formated XML:");
            System.out.println(formatXml);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
