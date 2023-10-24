package com.workintech.springfirsttrial.dto;

public class AnimalResponse {
    private String name;
    private String massage;
    private int status;

    public AnimalResponse(String name, String massage, int status) {
        this.name = name;
        this.massage = massage;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getMassage() {
        return massage;
    }

    public int getStatus() {
        return status;
    }
}
