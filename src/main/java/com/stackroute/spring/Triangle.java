package com.stackroute.spring;

public class Triangle {
    public String getType() {
        return type;
    }
    public Triangle(String type){
        this.type=type;
    }

    public Triangle(int height){
        this.height=height;
    }
//    public void setType(String type) {
//        this.type = type;
//    }

    private String type;
    private int height;

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void draw(){
        System.out.println(getType()+"Triangle drawn of height:"+getHeight());
    }
}
