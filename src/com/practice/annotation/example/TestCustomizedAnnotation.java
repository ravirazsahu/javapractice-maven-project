package com.practice.annotation.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestCustomizedAnnotation {

	@Test
	public void givenObjectSerializedThenTrueReturned() throws Exception {
	PersonIsAnnotated per=new PersonIsAnnotated("Ram","Singh","34","Mumbai");
	ObjectToJsonConverter json=new ObjectToJsonConverter();
	String actual=json.convertToJson(per);
	String expected="{\"perage\":\"34\",\"firstname\":\"Ram\",\"lastname\":\"Singh\"}";
	assertEquals(expected, actual);
	
	}
}
