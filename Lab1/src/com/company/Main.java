package com.company;

public class Main {

    public static void main(String[] args) {
	    Person person1 = new Person("Ben");
	    Lecturer lecturer1 = new Lecturer("Rama", 1);
	    Lecturer lecturer2 = new Lecturer("Tom", 2, new Office("Tom's flat", "Living room"));

        System.out.println("Name: " + person1.getName());
        System.out.println("");
        System.out.println("Name: " + lecturer1.getName());
        System.out.println("Staff Id: " + lecturer1.getStaffId());
        System.out.println("");
        System.out.println("Name: " + lecturer2.getName());
        System.out.println("Staff Id: " + lecturer2.getStaffId());
        System.out.println("Office Building: " + lecturer2.getOfficeLocation().getBuilding());
        System.out.println("Office room: " + lecturer2.getOfficeLocation().getRoom());
    }
}
