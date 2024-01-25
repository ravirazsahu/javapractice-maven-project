package com.practice.annotation.example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ObjectToJsonConverter {

	public String convertToJson(Object obj) throws Exception {
		try {
			checkIfSerializable(obj);
			initializeObjects(obj);
			return getJsonString(obj);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	private String getJsonString(Object obj) throws IllegalArgumentException, IllegalAccessException {
		Class<?> cls = obj.getClass();
		Map<String, String> jmap = new HashMap<String, String>();

		for (Field f : cls.getDeclaredFields()) {
			f.setAccessible(true);
			if (f.isAnnotationPresent(JsonElement.class)) {
				jmap.put(f.toString(), (String) f.get(obj));

			}
		}

		String retjsonstring = jmap.entrySet().stream()
				.map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
				.collect(Collectors.joining(","));

		return retjsonstring;
	}

	private void initializeObjects(Object obj)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> cls = obj.getClass();
		for (Method m : cls.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Init.class)) {
				m.setAccessible(true);
				m.invoke(obj);
			}
		}

	}

	private void checkIfSerializable(Object obj) throws Exception {
		if (Objects.isNull(obj)) {
			throw new Exception("The object is null.");
		}

		Class<?> cls = obj.getClass();
		if (!cls.isAnnotationPresent(JsonSerializable.class)) {
			throw new Exception("The Class " + cls.getSimpleName() + " is not annotated.");
		}

	}

}
