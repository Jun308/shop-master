/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.logging.Logger;

/**
 *
 * @author Derick-T
 */
public class AccountDetail {
    private int id;
    private String name;
    private String mobile;
    private int gender;
    private String address;
    private String note;

    public AccountDetail(int id, String name, String mobile, int gender, String address, String note) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.gender = gender;
        this.address = address;
        this.note = note;
    }

    public AccountDetail(String name, String mobile, int gender, String address) {
        this.name = name;
        this.mobile = mobile;
        this.gender = gender;
        this.address = address;
    }

    public AccountDetail(int id, String name, String mobile, String address, String note) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.note = note;
    }

    public AccountDetail(int id, String name, String mobile, int gender, String address) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.gender = gender;
        this.address = address;
    }

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", name=" + name + ", mobile=" + mobile + ", gender=" + gender + ", address=" + address + '}';
    }

    
    
}
