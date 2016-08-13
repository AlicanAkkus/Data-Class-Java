package com.wora.stringify;

import java.lang.reflect.Field;
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
	
	
	/**
	 * @param o to printed
	 * @param type of return type such as string, xml, json. not yet implemented
	 * @return all name : value class member
	 * */
	public static synchronized String toString(Object o, ReturnType type) {

		// Book book = new Book("ASD", 11);

		StringBuilder builder = new StringBuilder("\n*******************BEGIN*******************\n");
		builder.append("{\n");
		try {
			Class<?> c = o.getClass();

			Field fields[] = c.getDeclaredFields();

			for (Field f : fields) {
				Field declaredField = c.getDeclaredField(f.getName());
				declaredField.setAccessible(true);// for private variable

				builder.append("\t").append(declaredField.getName()).append(" : ");
				if(declaredField.get(o) != null){
					builder.append(declaredField.get(o).toString()).append("\n");
				}else{
					builder.append("Unknow").append("\n");
				}

			}


			builder.append("}");
			builder.append("\n####################END####################\n");

			String result = builder.toString();
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return builder.toString();
		}

	}
	
	public static String toString(Object o) {
		return toString(o,ReturnType.STRING);
	}
}
