# Data-Class-Java
# Such as Scala case class Java Data class with reflection api

When we print the object to output stream printed hashcode of object. I'm created exercise of Java reflection. When invoked toString() method return all class variable name and value pair as String.

How use it?

Using very easy for example;
Override toString() method and then write it;

``` java
@Override
public String toString(){
    return Stringify.toString(this);
}
```

And then you create your java bean as follow Book
``` java
Book book = new Book("Kurk Mantolu Madonna", 2015);// name , id
```

When you invoked book.toString() in anything your code you will be display as follow string;

Above code returned String for example;

``` json
{
	name : Kurk Mantolu Madonna
	id : 2015

}
```




