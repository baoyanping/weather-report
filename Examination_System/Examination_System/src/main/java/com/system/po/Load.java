package com.system.po;

public class Load {
    private int load_id;
    private String load_title;
    private String load_content;
    private String load_publishdate;
    private String load_publishtime;
    private String load_from;
    private String load_image;


    @Override
    public String toString() {
        return "load{" +
                "load_id=" + load_id +
                ", load_title='" + load_title + '\'' +
                ", load_content='" + load_content + '\'' +
                ", load_publishdate='" + load_publishdate + '\'' +
                ", load_publishtime='" + load_publishtime + '\'' +
                ", load_from='" + load_from + '\'' +
                ", load_image='" + load_image + '\'' +
                '}';
    }

    public int getLoad_id() {
        return load_id;
    }

    public void setLoad_id(int load_id) {
        this.load_id = load_id;
    }

    public String getLoad_title() {
        return load_title;
    }

    public void setLoad_title(String load_title) {
        this.load_title = load_title;
    }

    public String getLoad_content() {
        return load_content;
    }

    public void setLoad_content(String load_content) {
        this.load_content = load_content;
    }

    public String getLoad_publishdate() {
        return load_publishdate;
    }

    public void setLoad_publishdate(String load_publishdate) {
        this.load_publishdate = load_publishdate;
    }

    public String getLoad_publishtime() {
        return load_publishtime;
    }

    public void setLoad_publishtime(String load_publishtime) {
        this.load_publishtime = load_publishtime;
    }

    public String getLoad_from() {
        return load_from;
    }

    public void setLoad_from(String load_from) {
        this.load_from = load_from;
    }

    public String getLoad_image() {
        return load_image;
    }

    public void setLoad_image(String load_image) {
        this.load_image = load_image;
    }

    public Load(int load_id, String load_title, String load_content, String load_publishdate, String load_publishtime, String load_from, String load_image) {
        this.load_id = load_id;
        this.load_title = load_title;
        this.load_content = load_content;
        this.load_publishdate = load_publishdate;
        this.load_publishtime = load_publishtime;
        this.load_from = load_from;
        this.load_image = load_image;
    }

    public Load() {
    }


}
