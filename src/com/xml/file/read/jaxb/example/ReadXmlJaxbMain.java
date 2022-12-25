package com.xml.file.read.jaxb.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadXmlJaxbMain {

    private static final String FILENAME = "src/com/xml/file/read/jaxb/example/employeeJaxb.xml";

    public static void main(String[] args) {
    	File xmlFile = new File(FILENAME);
    
    JAXBContext jaxbContext;
    try
    {
      jaxbContext = JAXBContext.newInstance(EmployeeXML.class);        
     
      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
     
      EmployeeXML employee = (EmployeeXML) jaxbUnmarshaller.unmarshal(xmlFile);
       
      System.out.println(employee);
    }
    catch (JAXBException e) 
    {
      e.printStackTrace();
    }}

}