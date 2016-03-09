import java.lang.reflect.Field;

public class Stringify {

	public static synchronized String toString(Object o, RETURN_TYPE type) {

		// Book book = new Book("ASD", 11);

		try {
			Class<?> c = o.getClass();

			Field fields[] = c.getDeclaredFields();
			StringBuilder builder = new StringBuilder("\n*******************BEGIN*******************\n");
			builder.append("{\n");
			boolean complexObject = false;
			//
			// if (type == RETURN_TYPE.STRING) {
			// builder.append("{\n");
			// }

			for (Field f : fields) {
				Field declaredField = c.getDeclaredField(f.getName());
				declaredField.setAccessible(true);// for private variable

				builder.append("\t").append(declaredField.getName()).append(" : ");
				builder.append(declaredField.get(o).toString()).append("\n");

			}

			if (complexObject)
				builder.append("\t");

			builder.append("}");
			builder.append("\n####################END####################\n");

			String result = builder.toString();
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}

	}
}

enum RETURN_TYPE {
	XML, JSON, STRING;
}
