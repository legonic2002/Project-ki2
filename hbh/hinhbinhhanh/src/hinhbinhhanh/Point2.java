/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhbinhhanh;

/**
 *
 * @author Legon
 */
public class Point2 {
    Point A,B,C,D;

    public Point2(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point C) {
        this.C = C;
    }

    public Point getD() {
        return D;
    }

    public void setD(Point D) {
        this.D = D;
    }

    @Override
    public String toString() {
        return "Point2{ " + "A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + '}';
    }
    
}
