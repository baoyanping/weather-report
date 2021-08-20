package com.system.po;

public class Knows {
    private int id;
    private String title;
    private String content;

    public Knows() {
    }

    public Knows(int id, String title, String content) {

        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Knows{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
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
}
