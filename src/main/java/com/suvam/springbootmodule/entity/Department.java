package com.suvam.springbootmodule.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int departmentId;
    int departmentName;
    int departmentCode;
    String departmentAddress;

    public Department() {
        // Default Constructor
    }

    public Department(int departmentId, int departmentName, int departmentCode, String departmentAddress) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.departmentAddress = departmentAddress;
    }

    // Getters and Setters
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public int getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(int departmentName) {
        this.departmentName = departmentName;
    }
    public int getDepartmentCode() {
        return departmentCode;
    }
    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }
    public String getDepartmentAddress() {
        return departmentAddress;
    }
    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    @Override
    public String toString() {
        return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentCode="
                + departmentCode + ", departmentAddress=" + departmentAddress + "]";
    }

    

}
