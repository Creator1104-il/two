class Reader {
    private String Polnoe_name;
    private String nomer_bileta;
    private String facultet;
    private String den_roschedia;
    private String nomer_telefona;
    public Reader(String fullName, String ticketNumber, String faculty, String birthDate, String phone) {
        this.Polnoe_name = fullName;
        this.nomer_bileta = ticketNumber;
        this.facultet = faculty;
        this.den_roschedia = birthDate;
        this.nomer_telefona = phone;
    }
    public void takeBook(int numberOfBooks) {
        System.out.println(Polnoe_name + " взял " + numberOfBooks + " книги.");
    }
    public void takeBook(String... bookNames) {
        System.out.print(Polnoe_name + " взял книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i]);
            if (i < bookNames.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
    public void returnBook(int numberOfBooks) {
        System.out.println(Polnoe_name + " вернул " + numberOfBooks + " книги.");
    }
    public void returnBook(String... bookNames) {
        System.out.print(Polnoe_name + " вернул книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i]);
            if (i < bookNames.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
    public void displayInfo() {
        System.out.println("ФИО: " + Polnoe_name + ", Номер билета: " + nomer_bileta + ", Факультет: " + facultet + ", Дата рождения: " + den_roschedia + ", Телефон: " + nomer_telefona);
    }
}
public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Петров В. В.", "0001", "Физика", "01.01.2000", "1234567890");
        readers[1] = new Reader("Иванов И. И.", "0002", "Математика", "02.02.2001", "0987654321");
        readers[2] = new Reader("Сидоров С. С.", "0003", "Химия", "03.03.2002", "1122334455");
        readers[3] = new Reader("Кузнецова А. А.", "0004", "Биология", "04.04.2003", "2233445566");
        readers[4] = new Reader("Смирнов П. П.", "0005", "История", "05.05.2004", "3344556677");
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            reader.displayInfo();
        }
        System.out.println(" ");
        for(int i = 0;i< readers.length;i++) {
            readers[i].takeBook(3);
            readers[i].takeBook("Приключения", "Словарь", "Энциклопедия");
            readers[i].returnBook(3);
            readers[i].returnBook("Приключения", "Словарь", "Энциклопедия");
        }
    }
}