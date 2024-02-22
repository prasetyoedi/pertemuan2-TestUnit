package org.example;

public class Student {
    public String name;
    public int semester;
    public boolean isActive;

    public Student(String name, int semester, boolean isActive){
        this.name=name;
        this.semester=semester;
        this.isActive=isActive;
    }

    public boolean isDoingMBKM(){
        return semester > 6 && isActive;
    }
}
