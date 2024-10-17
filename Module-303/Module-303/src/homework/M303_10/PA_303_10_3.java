package homework.M303_10;

interface LibraryUser {
    void registerAccount();
    void requestBook();
}

class KidUser implements LibraryUser {
    private int age;
    private String bookType;

    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook() {
        if ("Kids".equalsIgnoreCase(bookType)) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}

class AdultUser implements LibraryUser {
    private int age;
    private String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {
        if ("Fiction".equalsIgnoreCase(bookType)) {
            System.out.println("Book issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}

class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Test case #1: KidUser
        KidUser kid1 = new KidUser(10, "Kids");
        kid1.registerAccount();
        kid1.requestBook();

        KidUser kid2 = new KidUser(18, "Fiction");
        kid2.registerAccount();
        kid2.requestBook();

        // Test case #2: AdultUser
        AdultUser adult1 = new AdultUser(5, "Kids");
        adult1.registerAccount();
        adult1.requestBook();

        AdultUser adult2 = new AdultUser(23, "Fiction");
        adult2.registerAccount();
        adult2.requestBook();
    }
}


public class PA_303_10_3 {
}
