/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author hp
 */
public class student {
    private int id;
    private String name;
    private String className;
    private String CNIC;
    private String address;
    private Date admissionDate;
    private byte[] image;
    private boolean deleted;
    private String rollNo;
    private String fatherName;
    private String fatherCNIC;
    private String motherName;
    private String motherCNIC;
    private String fatherPh;
    private String religion;
    private String cast;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherCNIC() {
        return fatherCNIC;
    }

    public void setFatherCNIC(String fatherCNIC) {
        this.fatherCNIC = fatherCNIC;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherCNIC() {
        return motherCNIC;
    }

    public void setMotherCNIC(String motherCNIC) {
        this.motherCNIC = motherCNIC;
    }

    public String getFatherPh() {
        return fatherPh;
    }

    public void setFatherPh(String fatherPh) {
        this.fatherPh = fatherPh;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + ", className=" + className + ", CNIC=" + CNIC + ", address=" + address + ", admissionDate=" + admissionDate + ", image=" + image + ", deleted=" + deleted + ", rollNo=" + rollNo + ", fatherName=" + fatherName + ", fatherCNIC=" + fatherCNIC + ", motherName=" + motherName + ", motherCNIC=" + motherCNIC + ", fatherPh=" + fatherPh + ", religion=" + religion + ", cast=" + cast + '}';
    }
}
