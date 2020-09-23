package com.company;

public class Lecturer extends Person{
    private int staffId;
    private Office officeLocation;

    public Lecturer(String name, int staffId) {
        super(name);
        this.staffId = staffId;
    }

    public Lecturer(String name, int staffId, Office officeLocation) {
        super(name);
        this.staffId = staffId;
        this.officeLocation = officeLocation;
    }

    public int getStaffId() {
        return staffId;
    }

    public Office getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(Office officeLocation) {
        this.officeLocation = officeLocation;
    }
}
