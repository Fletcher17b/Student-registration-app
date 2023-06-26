package classes;


public class student {

    public student() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
     public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public student(String name, String last_name, String ID, int edad, float gpa) {
        this.name = name;
        this.last_name = last_name;
        this.ID = ID;
        this.edad = edad;
        this.gpa = gpa;
    }
    
    private String name;
    private String last_name;
    private String ID;
    private int edad;
    private float gpa;
    
    
   
}
