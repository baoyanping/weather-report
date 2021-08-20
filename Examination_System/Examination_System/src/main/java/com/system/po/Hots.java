package com.system.po;





public class Hots {
    private int id;
    private String title;
    private  String content;
    private  String publishman;
    private String publishdate;
    private  String publishtime;

    public Hots(int id, String title, String content, String publishman, String publishdate, String publishtime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publishman = publishman;
        this.publishdate = publishdate;
        this.publishtime = publishtime;
    }

    public Hots() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishman() {
        return publishman;
    }

    public void setPublishman(String publishman) {
        this.publishman = publishman;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    @Override
    public String toString() {
        return "Focus{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", publishman='" + publishman + '\'' +
                ", publishdate='" + publishdate + '\'' +
                ", publishtime='" + publishtime + '\'' +
                '}';
    }
}
