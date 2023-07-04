package classes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class student {

    
    private int birthyear;
    private int birthmonth;
    private int birthday;
    private String name;
    private String last_name;
    private String ID;
    private String genero;
    private int edad;
    private float gpa;
    
    
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
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(int birthmonth) {
        this.birthmonth = birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    
    public int calculate_age(int age_input){
        int age;
        age = LocalDate.now().getYear() - age_input;      
        return age;
    }

    @Override
    public String toString() {
        return "student{" + "birthyear=" + birthyear + ", birthmonth=" + birthmonth + ", birthday=" + birthday + ", name=" + name + ", last_name=" + last_name + ", ID=" + ID + ", genero=" + genero + ", edad=" + edad + ", gpa=" + gpa + '}';
    }
    
   
    
    
   
}
