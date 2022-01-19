/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptrenlophinhchunhat;

/**
 *
 * @author Legon
 */
class line {
    Point beginningPoint, endingPoint;

    public line(Point beginningPoint, Point endingPoint) {
        this.beginningPoint = beginningPoint;
        this.endingPoint = endingPoint;
    }



    public Point getBeginningPoint() {
        return beginningPoint;
    }

    public void setBeginningPoint(Point beginningPoint) {
        this.beginningPoint = beginningPoint;
    }

    public Point getEndingPoint() {
        return endingPoint;
    }

    public void setEndingPoint(Point endingPoint) {
        this.endingPoint = endingPoint;
    }

    @Override
    public String toString() {
        return "line{" + "beginningPoint=" + beginningPoint + ", endingPoint=" + endingPoint + '}';
    }









    
    
    
}
