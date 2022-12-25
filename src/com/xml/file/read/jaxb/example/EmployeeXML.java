package com.xml.file.read.jaxb.example;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeXML implements Serializable{
 
  private static final long serialVersionUID = 1L;
   
  private Integer id;
  private String firstName;
  private String lastName;
  private List<Department> department;
   
  public EmployeeXML() {
    super();
  }
 
  public EmployeeXML(int id, String fName, String lName, List<Department> department) {
    super();
    this.id = id;
    this.firstName = fName;
    this.lastName = lName;
    this.department = department;
  }
 
  //Setters and Getters
 
  @Override
  public String toString() {
    return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department="+ department + "]";
  }
}
 