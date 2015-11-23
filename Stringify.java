import java.lang.reflect.Field;

public class Stringify {

	public static String toString(Object o) {

		// Book book = new Book("Kurk Mantolu Madonna", 2015);

		try {
			Class<?> c = o.getClass();

			Field field[] = c.getDeclaredFields();
			StringBuilder builder = new StringBuilder("[Object hashcode] : [" + o.hashCode() + "]\n");
			for (Field f : field) {
				Field declaredField = c.getDeclaredField(f.getName());
				declaredField.setAccessible(true);
				builder.append("[Field Name] : [" + declaredField.getName() + "]\t[Field Value] : [" + declaredField.get(o) + "]\n");
			}

			return builder.toString();

		} catch (Exception e) {
			return "";
		}

	}

}
