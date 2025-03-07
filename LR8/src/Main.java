class Person {
    private String Name;
    private String Familia;
    private int birthYear;
    public Person(String Name, String Familia, int birthYear) {
        this.Name = Name;
        this.Familia = Familia;
        this.birthYear = birthYear;
    }
    public void Vivod() {
        System.out.println("Имя: " + Name + ", Фамилия: " + Familia + ", Год рождения: " + birthYear);
    }
    public String getName() {
        return Name;
    }
}
class Car {
    private String Marka;
    private int year;
    private double objom_Dvigatela;
    public Car(String Marka, int year, double objom_Dvigatela) {
        this.Marka = Marka;
        this.year = year;
        this.objom_Dvigatela = objom_Dvigatela;
    }
    public void VIvod() {
        System.out.println("Марка: " + Marka + ", Год выпуска: " + year + ", Объем двигателя: " + objom_Dvigatela);
    }
    public String getMarka() {
        return Marka;
    }
}
class Book {
    private String Nazvanie;
    private String author;
    private int god_Izdania;

    public Book(String Nazvanie, String author, int god_Izdania) {
        this.Nazvanie = Nazvanie;
        this.author = author;
        this.god_Izdania = god_Izdania;
    }
    public void vivod() {
        System.out.println("Название: " + Nazvanie + ", Автор: " + author + ", Год выпуска: " + god_Izdania);
    }
    public String getNazvanie() {
        return Nazvanie;
    }
    public void printInfo(Person person, Car car) {
        System.out.println(person.getName() + " читает книгу " + Nazvanie + " про машину " + car.getMarka());
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", "Иванов", 1990);
        Car car = new Car("Toyota", 2020, 2.0);
        Book book = new Book("Мир технологий", "Алексей", 2022);
        person.Vivod();
        car.VIvod();
        book.vivod();
        book.printInfo(person, car);
    }
}