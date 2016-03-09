# Data-Class-Java
With reflection data class in Java as Scala case class

When we print the object to output stream printed hashcode of object. I'm created exercise Java reflection when invoked toString() method of object. When invoked toString() method return all class variable name and value as String.

How use it?

Using very easy for example;

Book book = new Book("Kurk Mantolu Madonna", 2015);// name , id

Stringify.toString(book);

Above code returned String for example;

*******************BEGIN*******************
{
	name : Kurk Mantolu Madonna
	id : 2015
	eBook : 
*******************BEGIN*******************
{
	name : Kuyucaklı Yusuf
	id : 2015
}
####################END####################

	epubBook : 
*******************BEGIN*******************
{
	name : İçimizdeki Şeytan
	id : 2015
}
####################END####################

}
####################END####################



