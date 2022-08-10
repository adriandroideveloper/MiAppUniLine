package com.example.uniline;


public class ListElement {
    public String name;
    public String info;
    public String ver;

    public ListElement (String name, String info, String ver){

        this.name = name;
        this.info = info;
        this.ver = ver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }
}
