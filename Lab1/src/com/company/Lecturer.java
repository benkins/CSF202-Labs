package com.company;

public class Lecturer extends Person{
    private int staffId;
    private String officeLocation;

    public Lecturer(String name, int staffId) {
        super(name);
        this.staffId = staffId;
        System.out.println("Staff member created");
    }

    public int getStaffId() {
        return staffId;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
