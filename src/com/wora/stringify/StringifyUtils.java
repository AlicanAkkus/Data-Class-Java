package com.wora.stringify;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StringifyUtils {

	public synchronized String toString(ConcurrentHashMap<String, String> fieldsMap, boolean prettyPrint) throws Exception {

		if (prettyPrint) {
			return prettyToStrig(fieldsMap);
		}

		return nonPrettyToStrig(fieldsMap);
	}

	private String prettyToStrig(ConcurrentHashMap<String, String> fieldsMap) throws Exception {

		StringBuilder objectString = new StringBuilder("{\n");

		try {
			for (Map.Entry<String, String> entry : fieldsMap.entrySet()) {
				String fieldKey = entry.getKey();
				String fieldValue = entry.getValue();

				objectString.append("\t").append(fieldKey).append(" : ").append(fieldValue).append("\n");
			}
			
			objectString.append("}");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}


		return objectString.toString();

	}

	private String nonPrettyToStrig(ConcurrentHashMap<String, String> fieldsMap) throws Exception {

		StringBuilder objectString = new StringBuilder("{ ");

		try {
			for (Map.Entry<String, String> entry : fieldsMap.entrySet()) {
				String fieldKey = entry.getKey();
				String fieldValue = entry.getValue();

				objectString.append(fieldKey).append(" : ").append(fieldValue).append(", ");
			}

			objectString.deleteCharAt(objectString.lastIndexOf(",")).append("}");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

		return objectString.toString();
	}

	public static void main(String[] args) throws Exception {

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

		map.put("name", "alican");
		map.put("surname", "akkus");

		System.err.println(new StringifyUtils().prettyToStrig(map));

	}

}
