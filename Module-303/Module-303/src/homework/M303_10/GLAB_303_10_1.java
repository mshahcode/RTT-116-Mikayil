package homework.M303_10;

class Person {
    String name;
    static int lifeSpan = 60;
    static double ageFactor = 1.0;

    public Person() {

        name = "";
    }

    public Person(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String toString() {
        return ("Hello, my name is " + name);
    }

    public String talk() {
        return ("I have nothing to say.");
    }
}

class Boy extends Person {
    static double   ageFactor = 1.1;

    public String talk() {
        return(super.talk() + " ... but I love Java class.");
    }
    public String walk() {
        return("I am now walking");
    }
}


class Girl extends Person {
    static double   ageFactor = 1.3;
   public Girl(String aName) {
        name = "Ms." + aName;
    }

    public String talk() {
        return("Hello! " + jump());
    }
    public String jump() {
        return("I am jumping.");
    }
    public static double lifeSpan() {
        return(lifeSpan * ageFactor);
    }
}


public class GLAB_303_10_1 {
}
