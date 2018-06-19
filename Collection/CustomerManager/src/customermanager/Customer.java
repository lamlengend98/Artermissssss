/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermanager;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Customer implements Serializable{
    private String id;
    private String name;
    private String address;
    private String age;

    public Customer() {
    }

    public Customer(String id, String name, String address, String age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "=====\nName: " + this.getName() + "\nAddress: " + this.getAddress() + "\nAge: " + this.getAge();
    }
    
}
