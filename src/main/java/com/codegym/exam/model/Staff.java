package com.codegym.exam.model;

import javax.persistence.*;

@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String staffid;
    private String namestaff;
    private String groupstaff;
    private String dob;
    private String sex;
    private String phone;
    private String numidentity;
    private String email;
    private String address;


    public Staff() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getNamestaff() {
        return namestaff;
    }

    public void setNamestaff(String namestaff) {
        this.namestaff = namestaff;
    }

    public String getGroupstaff() {
        return groupstaff;
    }

    public void setGroupstaff(String groupstaff) {
        this.groupstaff = groupstaff;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNumidentity() {
        return numidentity;
    }

    public void setNumidentity(String numidentity) {
        this.numidentity = numidentity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
