package homework.M303_11;

import java.util.TreeMap;
import java.util.Map;

class PhoneDirectoryWithTreeMap {
    private TreeMap<String, String> data;

    /**
     * Constructor creates an initially empty directory.
     */
    public PhoneDirectoryWithTreeMap() {
        this.data = new TreeMap<String, String>();
    }

    /**
     * Finds the phone number, if any, for a given name.
     *
     * @return The phone number associated with the name; if the name does
     * not occur in the phone directory, then the return value is null.
     */
    public String getNumber(String name) {
        return this.data.get(name);
    }

    /**
     * Associates a given name with a given phone number.  If the name
     * already exists in the phone directory, then the new number replaces
     * the old one.  Otherwise, a new name/number pair is added.  The
     * name and number should both be non-null.  An IllegalArgumentException
     * is thrown if this is not the case.
     */
    public void putNumber(String name, String number) {
        if (name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");
        this.data.put(name, number);
    }

    /**
     * Write the contents of the phone directory to System.out.
     */
    public void print() {
        for (Map.Entry<String, String> entry : this.data.entrySet())
            System.out.println(entry.getKey() + ":  " + entry.getValue());
    }
}

class TestPhoneDirectoryWithTreeMap {
    public static void main(String[] args) {
        PhoneDirectoryWithTreeMap directory = new PhoneDirectoryWithTreeMap();
        System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
        System.out.println("adds several entries.  It then prints the contents of");
        System.out.println("directory and does a few lookups.");
        System.out.println();
        directory.putNumber("Fred","555-1234");
        directory.putNumber("Barney","555-2345");
        directory.putNumber("Wilma","555-3456");
        directory.putNumber("Wilma","555-3456");
        directory.putNumber("Wilma","555-2563");
        // directory.putNumber("James",null);
        //directory.putNumber(null,"555-2853");

        System.out.println("Contents are:");
        System.out.println();
        directory.print();
        System.out.println();
        System.out.println("Number for Fred is " + directory.getNumber("Fred"));
        System.out.println("Number for Wilma is " + directory.getNumber("Wilma"));
        System.out.println("Number for Tom is " + directory.getNumber("Tom"));
        System.out.println("Number for Tom is " + directory.getNumber("Alex"));
        // The output from the last line should be null.
    }
}


public class GLAB_303_11_7 {
}
