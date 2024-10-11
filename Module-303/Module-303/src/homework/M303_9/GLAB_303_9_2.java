package homework.M303_9;

class Doctor {
    String DoctorName;
    String Department;
    public void Doctor_Details() {
        System.out.println("Doctor Details...");
    }
}

class Surgeon extends Doctor {
    void Surgeon_Details() {
        System.out.println("Surgeon  Detail...");
        System.out.println(Department = "Cardio");
    }
}

class Hospital {
    public static void main(String args[]) {
        Surgeon s = new Surgeon();
        s.Doctor_Details();
        s.Surgeon_Details();
    }
}


public class GLAB_303_9_2 {
}
