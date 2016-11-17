# Data-Class-Java
# Data class in java with Reflection such as Scala case class

When we print the object to output stream, java will be print hashcode of object. I'm created exercise of Java reflection. When you invoke the toString() method, return all class variable withh pretty print name and value pair as String.

How use it?

Using very easy for example;
Override toString() method and then write it;

``` java
@Override
public String toString(){
    return Stringify.toString(this);
}
```

And then you create your java bean as follow; Book
``` java
Book book = new Book("Kurk Mantolu Madonna", 2015);// name , id
```

Default print format is pretty print. You can use pure name value string such as;

When you invoked book.toString() in anything your code you will be display as follow string;

``` java
@Override
	public String toString() {
		return Stringify.toString(this, ReturnType.STRING);
	}
```

Above code returned String for example;

``` java
{
	name : Kurk Mantolu Madonna
	id : 2015

}
```

Default print format is pretty. You can use pure name value string such as;
``` java
@Override
	public String toString() {
		return Stringify.toString(this, ReturnType.STRING, false);
	}
```
Above code returned String for example;

``` java
{ name : Kurk Mantolu Madonna, id : 2015 }
```



