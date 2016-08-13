package com.wora.stringify;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import com.wora.enums.ReturnType;



/** 
 * The DataClass program implement reflection api and print all variable of object
 * @author wora - alican akkus
 * @since 14-03-2016
 * @version 1.0
 * {
 * 	@link https://github.com/AlicanAkkus/Data-Class-Java
 * }
 * 
 * */

public class Stringify {
	
	private static StringifyUtils utils = new StringifyUtils();
	
	/**
	 * @param o to be printed
	 * @param type of return type such as string, xml, json. not yet implemented
	 * @return all class member returned (name : value) pair
	 * */
	public static synchronized String toString(Object o, ReturnType type, boolean prettyPrint) {

		StringBuilder builder = new StringBuilder("{\n");
		ConcurrentHashMap<String, String> fieldsMap = new ConcurrentHashMap<String, String>();
		try {
			Class<?> c = o.getClass();

			Field fields[] = c.getDeclaredFields();

			for (Field f : fields) {
				Field declaredField = c.getDeclaredField(f.getName());
				declaredField.setAccessible(true);// for private variable
				
				String fieldName = declaredField.getName();
				String fieldValue = "UNKNOW";
				if(declaredField.get(o) != null){
					fieldValue = declaredField.get(o).toString();
				}
				
				fieldsMap.put(fieldName, fieldValue);
			}
			
			
			String result = utils.toString(fieldsMap, prettyPrint);
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return builder.toString();
		}

	}
	
	public static String toString(Object o) {
		return toString(o,ReturnType.STRING, true);
	}
}
