# Data-Class-Java
With reflection data class in Java as Scala case class

When we print the object to output stream printed hashcode of object. I'm created exercise Java reflection when invoked toString() method of object. When invoked toString() method return all class variable name and value as String.

How use it?

Using very easy for example;

Book book = new Book("Kurk Mantolu Madonna", 2015);// name , id

Stringify.toString(book);

Above code returned String for example;
[Object hashcode] : [33168289]
[Field Name] : [name]	[Field Value] : [Kurk Mantolu Madonna]
[Field Name] : [id]	[Field Value] : [2015]

