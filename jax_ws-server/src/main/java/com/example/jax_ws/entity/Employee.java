package com.example.jax_ws.entity;

public class Employee {
    private int id;
    private String name;
    private String phone;
    private int status;

    public Employee() {
    }

    public Employee(int id, String name, String phone, int status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.status = status;
    }

    public Employee(String name, String phone, int status) {
        this.name = name;
        this.phone = phone;
        this.status = status;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
