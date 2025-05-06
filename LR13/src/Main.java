interface Product {
    String getName();
    double getPrice();
    double getRating();
}
class Book implements Product {
    private String name;
    private double price;
    private double rating;

    public Book(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}

class Laptop implements Product {
    private String name;
    private double price;
    private double rating;

    public Laptop(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}

class Phone implements Product {
    private String name;
    private double price;
    private double rating;

    public Phone(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}
interface User {
    String getUsername();
    String getPassword();
}
class Admin implements User {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Customer implements User {
    private String username;
    private String password;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Guest implements User {
    private String username;
    private String password;

    public Guest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
class ShopUser implements Product, User {
    private String username;
    private String password;
    private String productName;
    private double price;
    private double rating;
    public ShopUser(String username, String password, String productName, double price, double rating) {
        this.username = username;
        this.password = password;
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public double getRating() {
        return rating;
    }
    public void purchase() {
        System.out.println(getUsername() + " купил товар: " + productName);
    }
}
public class Main {
    public static void main(String[] args) {
        //Создание экземпляров классов Товар
        Product book = new Book("Java Programming", 29.99, 4.5);
        Product laptop = new Laptop("Dell XPS 13", 999.99, 4.8);
        Product phone = new Phone("iPhone 13", 799.99, 4.7);
        //Создание экземпляров классов Пользователь
        User admin = new Admin("admin", "admin123");
        User customer = new Customer("customer", "cust123");
        User guest = new Guest("guest", "guest123");
        //Создание экземпляров классов ShopUser
        ShopUser user = new ShopUser("user2", "password1", "Java Programming", 29.99, 4.5);
        user.purchase();
    }
}