/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atoms;

/**
 *
 * @author Legon
 */
public class State {
    int number;
        String symbol,fullname;
        double weight;

    public State(int number, String symbol, String fullname, double weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullname = fullname;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  number +  " "+ symbol + " " + fullname + " " + weight ;
    }
        
}
