public class Book {

	private String name;
	int id;

	private Book2 eBook = new Book2("Kuyucaklı Yusuf", 2015);
	private Book2 epubBook = new Book2("İçimizdeki Şeytan", 2015);

	Book(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return Stringify.toString(this, RETURN_TYPE.STRING);
	}

}
