package com.system.po;

public class Risk {
    private int id;
    private String highrisk;
    private String lowrisk;

    public Risk(int id, String highrisk, String lowrisk) {
        this.id = id;
        this.highrisk = highrisk;
        this.lowrisk = lowrisk;
    }

    public Risk() {
    }

    @Override
    public String toString() {
        return "Risk{" +
                "id=" + id +
                ", highrisk='" + highrisk + '\'' +
                ", lowrisk='" + lowrisk + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHighrisk() {
        return highrisk;
    }

    public void setHighrisk(String highrisk) {
        this.highrisk = highrisk;
    }

    public String getLowrisk() {
        return lowrisk;
    }

    public void setLowrisk(String lowrisk) {
        this.lowrisk = lowrisk;
    }
}
