package com.stackroute.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {

    private Point pointA;
    private Point pointB;
    private Point pointC;


    public Triangle(){
        System.out.println("--initialised--");
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    public void draw(){
        System.out.println("Point A=("+getPointA().getX()+","+getPointA().getY()+")");
        System.out.println("Point A=("+getPointB().getX()+","+getPointB().getY()+")");
        System.out.println("Point A=("+getPointC().getX()+","+getPointC().getY()+")");
    }
    public void myInit(){
        System.out.println("myInit method for Triangle");
    }
    public void myDestroy(){
        System.out.println("myDestroy method for Triangle");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean init method for Triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy method for Triangle");
    }
}
