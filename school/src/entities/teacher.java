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
public class teacher {
    private int id;
    private int personalNo;
    private String BPS;
    private String name;
    private String CNIC;
    private String religion;
    private String cast;
    private Date DOB; // Date of Birth
    private Date DOJ; // Date of Joining
    private Date DOR; // Date of Regularization
    private String spouceName;
    private String spouceCNIC;
    private int orderNo;
    private String ph;
    private String emailAddress;
    private Date created;
    private String address;
    private byte[] image;
    private String education;
    private boolean deleted;

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

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date date) {
        this.created = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int getPersonalNo() {
        return personalNo;
    }

    public void setPersonalNo(int personalNo) {
        this.personalNo = personalNo;
    }

    public String getBPS() {
        return BPS;
    }

    public void setBPS(String BPS) {
        this.BPS = BPS;
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

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Date getDOJ() {
        return DOJ;
    }

    public void setDOJ(Date DOJ) {
        this.DOJ = DOJ;
    }

    public Date getDOR() {
        return DOR;
    }

    public void setDOR(Date DOR) {
        this.DOR = DOR;
    }

    public String getSpouceName() {
        return spouceName;
    }

    public void setSpouceName(String spouceName) {
        this.spouceName = spouceName;
    }

    public String getSpouceCNIC() {
        return spouceCNIC;
    }

    public void setSpouceCNIC(String spouceCNIC) {
        this.spouceCNIC = spouceCNIC;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "teacher{" + "id=" + id + ", personalNo=" + personalNo + ", BPS=" + BPS + ", name=" + name + ", CNIC=" + CNIC + ", religion=" + religion + ", cast=" + cast + ", DOB=" + DOB + ", DOJ=" + DOJ + ", DOR=" + DOR + ", spouceName=" + spouceName + ", spouceCNIC=" + spouceCNIC + ", orderNo=" + orderNo + ", ph=" + ph + ", emailAddress=" + emailAddress + ", created=" + created + ", address=" + address + ", image=" + image + ", education=" + education + ", deleted=" + deleted + '}';
    }

        
}
